package Race;

public class FightToEnd {
    public static void fightToEnd(Race race1, Race race2) {
        while (race1.isAlive() && race2.isAlive()) {
            race1.attack(race2);
            race2.attack(race1);
        }

    }
}
