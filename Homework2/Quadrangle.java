package Homework2;

abstract class Quadrangle {
    int a,b;
    String color;

    public Quadrangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }
    abstract double getLargeDiagonal();
    abstract double getHeight();
    abstract String getColor();

}
