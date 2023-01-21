package SeaBord;

public class main {
    public static void main(String[] args) {
        SeaBoard game = new SeaBoard();
        game.shoot(2, 2, "h");
        game.shoot(2, 5, "h");
        game.shoot(2, 4, "h");
        game.shoot(2, 3, "d");
        game.printField(game.getField());

    }
}
