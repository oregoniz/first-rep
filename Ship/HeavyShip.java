package Ship;

public class HeavyShip extends Ship {
    int mass;

    public HeavyShip(String name, int year, int mass) {
        super(name, year);
        this.mass = mass;
    }

    @Override
    public String toString() {
//Код для определения нужного окончания слова при согласовании с
        int lastDigit;
        if (mass < 10)
            lastDigit = mass;
        else
            lastDigit = mass % 10;
        String ending;
        if(lastDigit == 1){
            ending = "у";
        }else if(lastDigit>1 && lastDigit<=4){
            ending = "ы";
        }else{
            ending = "";
        }
        String output;
        output = super.toString().replace(".", " ");
        output += String.format("и способно перевезти %d тонн%s груза.",

                mass, ending);

        return output;
    }
}
