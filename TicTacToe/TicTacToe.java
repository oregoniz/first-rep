package TicTacToe;

import java.util.Objects;

public class TicTacToe {
    String[][] field;
    String player;
    boolean gameEnd = false;

    public TicTacToe() {
        // создаем новую игру
        newGame();
    }

    public void newGame() {
        //System.out.println("new game");
        field = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        player = "X";
    }

    public String[][] getField() {

        return field;
    }

    public String checkGame() {

        for (int i = 0; i < 3; i++) {
            if (Objects.equals(field[i][0], "X") && Objects.equals(field[i][1], "X") && Objects.equals(field[i][2], "X"))
                return "X";
            if (Objects.equals(field[i][0], "0") && Objects.equals(field[i][1], "0") && Objects.equals(field[i][2], "0"))
                return "0";
        }
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(field[0][i], "X") && Objects.equals(field[1][i], "X") && Objects.equals(field[2][i], "X"))
                return "X";
            if (Objects.equals(field[0][i], "0") && Objects.equals(field[1][i], "0") && Objects.equals(field[2][i], "0"))
                return "0";
        }
        if (Objects.equals(field[0][0], "X") && Objects.equals(field[1][1], "X") && Objects.equals(field[2][2], "X"))
            return "X";
        if (Objects.equals(field[0][0], "0") && Objects.equals(field[1][1], "0") && Objects.equals(field[2][2], "0"))
            return "0";

        if (Objects.equals(field[2][0], "X") && Objects.equals(field[1][1], "X") && Objects.equals(field[0][2], "X"))
            return "X";
        if (Objects.equals(field[2][0], "0") && Objects.equals(field[1][1], "0") && Objects.equals(field[0][2], "0"))
            return "0";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Objects.equals(field[i][j], "-"))
                    return null;
            }
        }
        return "D";

    }

    public String makeMove(int x, int y) {

        if (gameEnd) {
            return "Game was ended";
        }
        x -= 1;
        y -= 1;

        if (Objects.equals(field[x][y], "-")) {
            if (Objects.equals(player, "X")) {
                field[x][y] = "X";
                player = "0";
            } else {
                field[x][y] = "0";
                player = "X";
            }
            String game = this.checkGame();

            if (Objects.equals(game, "X")) {
                gameEnd = true;
                return "Player X won";

            }

            if (Objects.equals(game, "0")) {
                gameEnd = true;
                return "Player 0 won";
            }

            if (Objects.equals(game, "D")) {
                gameEnd = true;
                return "Draw";
            }
            return "Move completed";
        } else {
            return "Cell " + (x + 1) + ", " + (y + 1) + " is already occupied";
        }
    }
}




