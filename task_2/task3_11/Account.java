package task_2.task3_11;

public class Account {
    private String name;
    private double balance;
    private double withdrawBalance;

    public Account(String name, double balance) {
        deposit(balance);
        setName(name);
    }

    public void deposit(double depositAmount) {

        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw() {
        if (withdrawBalance < balance) {
            System.out.printf("Success withdrawing %nbalance: $%.2f%n", balance - withdrawBalance);
        } else {
            System.out.printf("Withdrawal amount exceeded account balance %nbalance: $%.2f%n", balance);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWithdrawBalance(double withdrawBalance) {
        this.withdrawBalance = withdrawBalance;
    }
}