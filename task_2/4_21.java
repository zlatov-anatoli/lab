package task_2;

import java.util.Scanner;

public class 4_21 {
    public static void main(String[] args) {
        int counter = 0;
        int number = 0;
        int largest = 0;
        Scanner input = new Scanner(System.in);
        while (counter < 10) {
            System.out.println("Введите ваше число: ");
            number = input.nextInt();
            counter++;
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("largest number: " + largest);
    }
}