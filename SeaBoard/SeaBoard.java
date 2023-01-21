package SeaBoard;

import java.util.Arrays;
import java.util.Objects;

public class SeaBoard {
    private String[][] field;
    int shipLMax = 4;
    int fieldRange = 10;

    public SeaBoard() {
        field = new String[fieldRange][fieldRange];
        for (
                int i = 0;
                i < fieldRange; i++) {
            for (int j = 0; j < fieldRange; j++) {
                field[i][j] = ".";
            }
        }
    }

    void printField(String[][] field) {
        for (String[] strings : field) {
        System.out.println(Arrays.deepToString(strings));
        }
    }

    boolean inField(int line, int column) {
        return line >= 0 && line < fieldRange && column >= 0 && column < fieldRange;
    }

    void shoot(int line, int column, String issue) {
        System.out.println(line+" "+column+" "+issue);
        if (Objects.equals(issue, "m")) {
            field[line][column] = "#";
        }
        if (Objects.equals(issue, "h")) {
            field[line][column] = "x";
        }
        if (Objects.equals(issue, "d")) {
            field[line][column] = "x";
            Sink(line, column);
        }
    }

    public String[][] getField() {
        return field;
    }

    String check(int line, int column) {
        return field[line][column];
    }

    void Sink(int line, int column) {
        int[][] sinkShip = this.sunkShip(line, column);
        int l, c;
        for (int j = 0; j < sinkShip[1].length; j++) {
            l = sinkShip[0][j];
            c = sinkShip[1][j];
            if (l == -1) break;

            if (inField(l + 1, c) && Objects.equals(field[l + 1][c], ".")) field[l + 1][c] = "#";
            if (inField(l - 1, c) && Objects.equals(field[l - 1][c], ".")) field[l - 1][c] = "#";
            if (inField(l, c + 1) && Objects.equals(field[l][c + 1], ".")) field[l][c + 1] = "#";
            if (inField(l, c - 1) && Objects.equals(field[l][c - 1], ".")) field[l][c - 1] = "#";
            if (inField(l + 1, c + 1) && Objects.equals(field[l + 1][c + 1], ".")) field[l + 1][c + 1] = "#";
            if (inField(l - 1, c - 1) && Objects.equals(field[l - 1][c - 1], ".")) field[l - 1][c - 1] = "#";
            if (inField(l + 1, c - 1) && Objects.equals(field[l + 1][c - 1], ".")) field[l + 1][c - 1] = "#";
            if (inField(l - 1, c + 1) && Objects.equals(field[l - 1][c + 1], ".")) field[l - 1][c + 1] = "#";
        }
    }

    int[][] sunkShip(int line, int column) {
        int[][] sunk = new int[2][shipLMax];
        sunk[0][0] = line;
        sunk[1][0] = column;
        int index = 1;
        for (int i = 1; i < shipLMax; i++) {
            if (inField(line - i, column) && Objects.equals(check(line - i, column), "x")) {
                sunk[0][index] = line - i;
                sunk[1][index] = column;
                index += 1;
            } else break;
        }
        for (int i = 1; i < shipLMax; i++) {
            if (inField(line + i, column) && Objects.equals(check(line + i, column), "x")) {
                sunk[0][index] = line + i;
                sunk[1][index] = column;
                index += 1;
            } else break;
        }
        for (int i = 1; i < shipLMax; i++) {
            if (inField(line, column - i) && Objects.equals(check(line, column - i), "x")) {
                sunk[0][index] = line;
                sunk[1][index] = column - i;
                index += 1;
            } else break;
        }
        for (int i = 1; i < shipLMax; i++) {
            if (inField(line, column + i) && Objects.equals(check(line, column + i), "x")) {
                sunk[0][index] = line;
                sunk[1][index] = column + i;
                index += 1;
            } else break;
        }
        for (int i = index; i < sunk[1].length; i++) {
            sunk[0][i] = -1;
        }
        System.out.println(Arrays.deepToString(sunk));
        return sunk;
    }
}





