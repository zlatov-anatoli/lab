package task_1;

import java.util.Scanner;

public class 16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = input.nextInt();
        System.out.println("Введите второе число: ");
        int b = input.nextInt();
        if (a == b) {
            System.out.println("Numbers r equal");
        } else if (a > b) {
            System.out.println("first number is larger");

        } else {
            System.out.println("second number is larger");
        }
    }
}