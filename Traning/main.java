package Traning;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ToTable a = new ToTable(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 3, 4);
        int[][] arr = a.resize();
        System.out.println(Arrays.deepToString(arr));


        ToLine b = new ToLine(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}});
        int[] arrb = b.resize();
        System.out.println(Arrays.toString(arrb));
    }
}
