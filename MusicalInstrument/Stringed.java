package MusicalInstrument;

public class Stringed extends MusicalInstrument {
    int quantityOfStrings;

    public Stringed(String name, String manufacturer, double price, int quantityOfStrings) {
        super(name, manufacturer, price);
        this.quantityOfStrings = quantityOfStrings;
    }

    String play() {
        return name + " sounds beautiful";
    }
}
