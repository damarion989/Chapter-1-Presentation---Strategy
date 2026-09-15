interface AttackStrategy {
    void attack(String target);
}

class SwordAttack implements AttackStrategy {
    public void attack(String target) {
        System.out.println("Slashing " + target + " with a sword!");
    }
}

class BowAttack implements AttackStrategy {
    public void attack(String target) {
        System.out.println("Shooting an arrow at " + target + "!");
    }
}

class MagicAttack implements AttackStrategy {
    public void attack(String target) {
        System.out.println("Casting a fireball at " + target + "!");
    }
}

class GameCharacter {
    private final String name;
    private AttackStrategy attackStrategy;

    public GameCharacter(String name, AttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack(String target) {
        System.out.print(name + ": ");
        attackStrategy.attack(target);
    }
}

public class StrategyDemo {
    public static void main(String[] args) {
        GameCharacter hero =
                new GameCharacter("Knight", new SwordAttack());

        hero.attack("Goblin");

        hero.setAttackStrategy(new BowAttack());
        hero.attack("Dragon");
    }
}
