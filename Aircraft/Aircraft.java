package Aircraft;

public class Aircraft {
    int number, speed;

    public Aircraft(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    double flight(int n) {
        return n / speed;
    }

}
