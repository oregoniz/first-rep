package Traning;

public class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }
    public int[] resize() {
        int[] rez = new int[data.length * data[1].length];
        int index = 0;
        for (int[] datum : data) {
            System.arraycopy(datum, 0, rez, 0 + index, datum.length);
            index += datum.length;
        }
        return rez;
    }
}
