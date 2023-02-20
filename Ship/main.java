package Ship;

public class main {
    public static void main(String[] args) {
        Ship ship= new Ship("Sh",1977);
        PasShip pasShip= new PasShip("Pass",1974,160);
        HeavyShip heavyShip= new HeavyShip("H",1976,100);
        System.out.println(ship.toString());
        System.out.println(pasShip.toString());
        System.out.println(heavyShip.toString());

    }
}
