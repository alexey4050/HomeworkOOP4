public abstract class LigthShield extends Shields {
    public abstract  int endurance();

    @Override
    public String toString() {
        return String.format("Прочность щита %d, защита %d", endurance(), protection());
    }
}
