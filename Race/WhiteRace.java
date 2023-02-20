package Race;

public class WhiteRace extends Race{
    public WhiteRace() {
    }

    public WhiteRace(String name, int health, int power) {
        super(name, health, power);
    }

    public WhiteRace(int health, int power) {
        super(health, power);
    }

    public void scream() {
        System.out.println("Белый клич!");
    }
}
