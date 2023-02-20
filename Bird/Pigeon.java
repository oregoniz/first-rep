package Bird;

public class Pigeon extends Bird {
    public int getHunger() {
        return hunger;
    }

    private int hunger;

    public Pigeon(String[] continents, int population, int hunger) {
        super("pigeon", continents, population);
        this.hunger = hunger;
    }

    public void askForSeeds() {
        if (hunger - 7 > 0) hunger -= 7;
        else hunger = 0;
    }
    public void sleep(){
        hunger+=3;
    }
}
