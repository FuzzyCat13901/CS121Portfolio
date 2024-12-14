package weekTen.labTen;

public class Mage extends weekTen.labTen.Character implements Fighter {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " casts a spell!");
    }

    @Override
    public void defend() {
        System.out.println(getName() + " uses magic shield!");
    }
}