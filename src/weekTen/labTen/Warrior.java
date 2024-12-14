package weekTen.labTen;

public class Warrior extends weekTen.labTen.Character implements Fighter {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with strength!");
    }

    @Override
    public void defend() {
        System.out.println(getName() + " defends!");
    }
}