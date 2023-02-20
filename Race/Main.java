package Race;

import static Race.FightToEnd.fightToEnd;

public class Main {
    public static void main(String[] args) {
        RedRace redRace= new RedRace("Огр",100,30);
        WhiteRace whiteRace=new WhiteRace("Эльф",120,20);
        fightToEnd(redRace,whiteRace);
    }
}
