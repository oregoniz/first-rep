package Squirrel;

public class main {
    public static void main(String[] args) {
        Squirrel s = new Squirrel(new int[]{1, -1, 2, -2, -7, -7, 2, 1});
        System.out.println(s.maxNuts());
        Squirrel s2 = new Squirrel(new int[]{2, 5, -3, -1});
        System.out.println(s2.maxNuts());
        Squirrel s3 = new Squirrel(new int[]{1, -2, -4, 7, 3, -2, -2, 1, -1});
        System.out.println(s3.maxNuts());
        Squirrel s4 = new Squirrel(new int[]{-2, 2, 4, -6, -2, -1, -2, 1});
        System.out.println(s4.maxNuts());
        Squirrel s5 = new Squirrel(new int[]{1});
        System.out.println(s5.maxNuts());
        Squirrel s6 = new Squirrel(new int[]{-1});
        System.out.println(s6.maxNuts());
        Squirrel s7 = new Squirrel(new int[]{1, -2});
        System.out.println(s7.maxNuts());
        Squirrel s8 = new Squirrel(new int[]{1, -2, 4, 6, 3, -2, -2, -3, -1});
        System.out.println(s8.maxNuts());
        Squirrel s9 = new Squirrel(new int[]{1, 1, 1, 1, 1});
        System.out.println(s9.maxNuts());
        Squirrel s10 = new Squirrel(new int[]{1, 1, 1, 1, -1});
        System.out.println(s10.maxNuts());

    }

}
