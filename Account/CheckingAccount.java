package Account;

public class CheckingAccount extends Account{
    int debt;
    public CheckingAccount(int balance) {
        super(balance);
    }
    void withdraw(int n) {
        balance -= n;
    }
    int getDebt(){
        if (balance<0) return balance;
        else return 0;
    }
}
