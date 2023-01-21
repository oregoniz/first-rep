package SeaBoard;

public class main {
    public static void main(String[] args) {
        SeaBoard game = new SeaBoard();
        /*game.shoot(0, 2, "h");
        game.shoot(8, 2, "d");
        game.printField(game.getField());
        game.shoot(9, 6, "h");
        game.shoot(2, 2, "m");
        game.shoot(0, 0, "m");
        game.shoot(2, 5, "m");
        game.shoot(0, 7, "h");
        game.shoot(1, 7, "h");
        game.shoot(2, 7, "h");
        game.shoot(3, 7, "d");
        game.printField(game.getField());*/
        game.shoot(8, 9, "d");
        game.shoot(9, 9, "d");
        // game.shoot(1, 2, "d");
        game.printField(game.getField());


    }
}
