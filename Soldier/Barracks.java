package Soldier;

public class Barracks {
    static final int BARMAX = 3;
    private int index;
    Soldier[] soldiers;

    public Barracks() {
       soldiers = new Soldier[BARMAX];
       index=0;

    }

    public void add(Soldier someSoldier) {
        if (index < BARMAX) {
            soldiers[index] = someSoldier;
            index++;
        } else System.out.println("Барак переполнен");
    }

    public void visit() {
        for (Soldier s : soldiers) {
            s.sound();
        }
    }
}
