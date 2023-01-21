package Squirrel;

public class Squirrel {
    int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    int getNuts(int index) {
        return nuts[index];
    }

    public int maxNuts() {
        int max1;
        int max2;
        int max;

        if (nuts.length == 0) return 0;
        if (nuts.length == 1) {
            return Math.max(getNuts(0), 0);
        }
        max1 = getNuts(0);
        max2 = getNuts(1);


        for (int i = 1; i < nuts.length - 1; i++) {
            int m;

            if (getNuts(i) >= getNuts(i + 1) && getNuts(i) > 0) {
                m = getNuts(i);
            } else {
                m = getNuts(i + 1);
                i++;
            }

            max1 += m;
            if (max1 < 0) max1 = 0;
        }
        for (int i = 2; i < nuts.length - 2; i++) {
            int m;
            if (getNuts(i) > getNuts(i + 1)) {
                m = getNuts(i);
            } else {
                m = getNuts(i + 1);
                i++;
            }
            max2 += m;
            if (max2 < 0) max2 = 0;

        }
        max = Math.max(max1, max2);
        if (getNuts(nuts.length - 1) > 0) {
            max += getNuts(nuts.length - 1);

        }
        return Math.max(max, 0);
    }
}
