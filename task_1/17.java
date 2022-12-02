package task_1;

import java.util.Scanner;

public class 17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int a = input.nextInt();
        System.out.println("Input second integer: ");
        int b = input.nextInt();
        System.out.println("Input third integer: ");
        int c = input.nextInt();
        System.out.printf("Sum: %d%n", a + b + c);
        System.out.printf("Average %d%n", (a + b + c) / 3);
        System.out.printf("multiplication: %d%n", a * b * c);
        if (a > b && a > c) {
            System.out.println("First is larger");
        } else if (b > a && b > c) {
            System.out.println("Second is larger");

        } else {
            System.out.println("Third is larger");
        }

        if (a < b && a < c) {
            System.out.println("First is less");
        } else if (b < a && b < c) {
            System.out.println("Second is less");

        } else {
            System.out.println("Third is less");
        }
    }
}