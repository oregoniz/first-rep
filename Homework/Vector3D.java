package Homework;

public class Vector3D extends Vector {

    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override
    double getLength() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    @Override
    String getVectorCords() {
        return ((x1 - x2) + " " + (y1 - y2) + " " + (z1 - z2));
    }

    public double getScalarProduct(Vector3D vector) {
        String coord1 = getVectorCords();
        String coord2 = vector.getVectorCords();
        int a = Integer.parseInt(coord1.split(" ")[0]) * Integer.parseInt(coord2.split(" ")[0]);
        int b = Integer.parseInt(coord2.split(" ")[1]) * Integer.parseInt(coord1.split(" ")[1]);
        int c = Integer.parseInt(coord1.split(" ")[2]) * Integer.parseInt(coord2.split(" ")[2]);
        return a + b + c;
    }
}
