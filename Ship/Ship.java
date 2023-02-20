package Ship;

public class Ship {
    protected String name;
    protected int year;


    public Ship(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String toString() {
        String output = String.format("Судно \"%s\" построено в %d году.",
                name, year);
        return output;

    }

}
