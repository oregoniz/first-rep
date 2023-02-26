package Homework2;

public class Square extends Quadrangle implements Figure {

    public Square(int a, String color) {
        super(a, a, color);
    }

    public double getLargeDiagonal() {

        return Math.sqrt(2 * a*a);
    }

    public String getColor() {
        return super.color;
    }
    public double getHeight(){
        return this.a;
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
