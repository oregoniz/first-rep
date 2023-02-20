package Soldier;

public class Main {
    public static void main(String[] args) {
        Knight k = new Knight("Knight");
        Rifleman r = new Rifleman("Rif");
        Soldier s= new Soldier("Sam");
        Barracks b= new Barracks();
        b.add(k);
        b.add(r);
        b.add(s);
        b.visit();
    }
}
