package task_4;

import java.util.Scanner;

public class 6_26 {
    public static void main(String[] args) {
        int reversed = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = input.nextInt();
        while (value != 0) {

            int digit = value % 10;
            reversed = reversed * 10 + digit;

            value /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}