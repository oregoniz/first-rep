package Race;

public class Race {
    private String name;
    protected int health;
    private int power;
    private boolean alive = true;

    public Race() {
    }

    public Race(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public Race(int health, int power) {
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public boolean isAlive() {
        return alive;
    }

    public void scream() {
        System.out.println("Главный клич!");
    }

    public void attack(Race race) {
        System.out.printf("%s ",this.name);
        this.scream();
        this.health -= race.getPower();
        System.out.printf(" Меня ударили с силой %s Осталось здоровья: %d\n",race.getPower(),this.health );
        if (this.health <= 0) {
            this.alive = false;
            System.out.printf("%s Умер",this.name);}
    }
}
