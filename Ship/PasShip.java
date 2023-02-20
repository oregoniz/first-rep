package Ship;

public class PasShip extends Ship {
    int pasMax;

    public PasShip(String name, int year, int pasMax) {
        super(name, year);
        this.pasMax = pasMax;
    }

    public String toString() {
//Код для определения нужного окончания слова при согласовании с

        int lastDigit;
        if (pasMax < 10)
            lastDigit = pasMax;
        else
            lastDigit = pasMax % 10;
        String ending;

        if(lastDigit>=1 && lastDigit<=4){
            ending = "а";
        }else {
            ending = "ов";
        }

        String output;
        output = super.toString().replace(".", " ");
        output += String.format("и способно принять на борт %d пассажир%s.", pasMax, ending);

        return output;
    }
}
