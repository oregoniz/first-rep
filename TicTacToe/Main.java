package TicTacToe;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.newGame();

        System.out.println(game.makeMove(1, 2));
        System.out.println(Arrays.deepToString(game.getField()));
        System.out.println(game.makeMove(3, 2));
        System.out.println(Arrays.deepToString(game.getField()));
        System.out.println(game.makeMove(1, 3));
        System.out.println(Arrays.deepToString(game.getField()));
        System.out.println(game.makeMove(2, 2));
        System.out.println(Arrays.deepToString(game.getField()));
        System.out.println(game.makeMove(2, 3));
        System.out.println(Arrays.deepToString(game.getField()));
        System.out.println(game.makeMove(2, 2));
        System.out.println(Arrays.deepToString(game.getField()));
        System.out.println(game.makeMove(2, 1));
        System.out.println(Arrays.deepToString(game.getField()));
        System.out.println(game.makeMove(1, 1));
        System.out.println(Arrays.deepToString(game.getField()));
        System.out.println(game.makeMove(1, 1));

    }
}
