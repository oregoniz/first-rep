package Account;

public class Account {
    int balance;
    public int checkBalance() {
        return balance;
    }
    public Account(int balance) {
        this.balance = balance;
    }
    void withdraw(int n) {
        if (n > balance) balance = 0;
        else balance -= n;
    }
    void put(int n) {
        balance += n;
    }
}
