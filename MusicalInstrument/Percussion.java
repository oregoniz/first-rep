package MusicalInstrument;

public class Percussion extends MusicalInstrument{
    int year;

    public Percussion(String name, String manufacturer, double price,int year) {
        super(name, manufacturer, price);
        this.year=year;
    }
    String play(){
        return "Bump";
    }
}
