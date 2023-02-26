package Homework;

public class Vector2D extends Vector {


    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0);
    }

    @Override
    double getLength() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    @Override
    String getVectorCords() {
        return ((x1 - x2) + " " + (y1 - y2));
    }

    double getScalarProduct(Vector2D vector) {
        String coords = getVectorCords();
        String coords2 = vector.getVectorCords();
        return Integer.parseInt(coords.split(" ")[0]) * Integer.parseInt(coords2.split(" ")[0] + Integer.parseInt(coords2.split(" ")[1]) * Integer.parseInt(coords.split(" ")[1]));
    }

    double getAngle(Vector2D vector) {
        if (getLength()!=0&& vector.getLength()!=0){
            return getScalarProduct(vector)/(this.getLength()*vector.getLength());
        }
        else return -2.0;
    }
}
