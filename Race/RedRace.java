package Race;

public class RedRace extends Race{
    public RedRace() {
    }

    public RedRace(String name, int health, int power) {
        super(name, health, power);
    }

    public RedRace(int health, int power) {
        super(health, power);
    }

    public void scream() {
        System.out.println("Красный клич!");
    }
}
