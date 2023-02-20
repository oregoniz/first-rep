package Soldier;

public class Knight extends Soldier{
    int price=245;
    String phrase="Наше дело правое, а врага — найдем";

    public Knight(String name) {
        super(name);
    }
    public void feed(){
        System.out.println("Кормит коня");
    }
}
