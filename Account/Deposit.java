package Account;

public class Deposit extends Account {
    private int period;
    private double percent;

    public Deposit(int balance, int period, double percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    public double withdraw() {
        double rez = Double.parseDouble(String.valueOf(balance * (100 + percent))) / 100;
        if (period <= 0) {
            balance = 0;
            return rez;
        } else return 0;
    }

    public void waitDays(int n) {
        period -= n;
    }

    public boolean isPeriodExpired() {
        return period <= 0;
    }
}
