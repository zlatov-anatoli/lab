package task_2.task4_18;

public class Client {
    private int accountNumber;
    private int accountBalance;
    private int sumItems;
    private int creditLimit;
    private int newBalance;

    public Client(int accountNumber, int accountBalance, int sumItems, int creditLimit) {
        setAccountBalance(accountBalance);
        setAccountNumber(accountNumber);
        setCreditLimit(creditLimit);
        setSumItems(sumItems);
    }

    public void NewBalance() {
        this.newBalance = accountBalance + sumItems - creditLimit;
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
            System.out.println("New balance:" + newBalance);
        }
        else{
            System.out.println("New balance:" + newBalance);
        }

    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setSumItems(int sumItems) {
        this.sumItems = sumItems;
    }
}