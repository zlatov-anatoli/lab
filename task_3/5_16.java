package task_3;

import java.util.Scanner;

public class 5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите число от 1 до 30");
            int number = input.nextInt();
            for (int j = 0; j<number; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}