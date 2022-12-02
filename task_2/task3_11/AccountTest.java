package task_2.task3_11;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account acc = new Account("John Cena", 55.3);
        System.out.printf("%s balance: $%.2f %n%n", acc.getName(), acc.getBalance());
        System.out.println("Enter withdraw amount:");
        double withdraw = input.nextDouble();
        acc.setWithdrawBalance(withdraw);
        acc.withdraw();

    }
}