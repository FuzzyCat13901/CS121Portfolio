package weekTen.labTen;

public class Archer extends Character implements Fighter {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " shoots an arrow!");
    }

    @Override
    public void defend() {
        System.out.println(getName() + " dodges!");
    }
}