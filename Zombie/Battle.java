package Zombie;

public class Battle {
    static final int MONSTERMAX = 5;
    private int index = 0;
    private Monster[] monsters;

    public Battle() {
        monsters = new Monster[MONSTERMAX];
    }

    void add(Monster monster) {
        if (index < MONSTERMAX) {
            monsters[index++] = monster;
        } else System.out.println("No more monsters!");
    }

    void start() {
        run();
    }

    void run() {
        for (int i = 0; i < index; i++) {
            if (monsters[i] != null) {
                monsters[i].attack();
            }
        }
    }
}
