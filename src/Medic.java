public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage) {
        super(health, damage, "HEALING");
        this.healPoints = 100; // начальные единицы лечения
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность HEALING");
    }

    public void increaseExperience() {
        healPoints *= 1.1; // увеличение на 10%
        System.out.println("Medic увеличил единицы лечения до: " + healPoints);
    }
}
