package task_1;

import java.util.Scanner;

public class 15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Введите первое число:");
        a = input.nextInt();
        System.out.println("Введите второе число");
        b = input.nextInt();
        System.out.printf("Sum: %d%n", a + b);
        System.out.printf("Difference: %d%n", a - b);
        System.out.printf("division : %d%n", a / b);
        System.out.printf("multiplication: %d%n", a * b);

    }
}