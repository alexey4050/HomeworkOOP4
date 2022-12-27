public class Knigth extends Warrior<HeavyShield, Sword>{
    public Knigth(String name, int healthPoint, HeavyShield shields, Sword weapon) {
        super(name, healthPoint, shields, weapon);
    }

    @Override
    public String toString() {
        return "Рыцарь: " + super.toString();
    }
}
