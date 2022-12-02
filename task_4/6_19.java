package task_4;

import java.util.Scanner;

public class 6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side value:");
        int side = input.nextInt();
        System.out.println("Enter a symbol:");
        char fill = input.next().charAt(0);
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fill);
            }
            System.out.println();
        }

    }
}