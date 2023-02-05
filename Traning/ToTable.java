package Traning;

public class ToTable {
    int[] data;
    int x, y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }
    public int[][] resize() {
        int[][] rez = new int[x][y];
        int index = 0;
        for (int j = 0; j < x; j++) {
            for (int k = 0; k < y; k++) {
                rez[j][k] = data[k+index];
            }
            index+=y;
        }
        return rez;
    }
}

