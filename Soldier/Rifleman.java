package Soldier;

public class Rifleman extends Soldier{
    int price=205;
    String phrase="Мушкет и жену не дам никому";
    public Rifleman(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(this.name+" cтреляет.");
    }
}
