package Race;

public class BlackRace extends Race{
    public BlackRace() {
    }

    public BlackRace(String name, int health, int power) {
        super(name, health, power);
    }

    public BlackRace(int health, int power) {
        super(health, power);
    }

    public void scream() {
        System.out.println("Черный клич!");
    }
}
