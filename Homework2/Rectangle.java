package Homework2;

public class Rectangle extends Quadrangle implements Figure {

    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    public double getLargeDiagonal() {
        return Math.sqrt(a * a + b * b);
    }
    public String getColor() {
        return super.color;
    }
    public double getHeight(){
        return Math.min(a,b);
    }
    public double getArea(){
        return area();
    }
    public double getPerimeter(){
        return perimeter();
    }


    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*a+2*b ;
    }
}
