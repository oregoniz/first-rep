package MusicalInstrument;

public class MusicalInstrument {
    String name,manufacturer;
    double price;

    public MusicalInstrument(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }
    String info(){
        return name+" "+ manufacturer+" "+ price;
    }

}
