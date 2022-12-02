package task_4;

import java.util.Scanner;

public class 7_12 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            boolean flag = false;
            System.out.println("Input 5 number between 10 and 100 inlusive:");
            int value = input.nextInt();
            if (value > 10 & value < 100) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] == value) {
                        flag = true;
                        System.out.println(value + " is not unique");
                        break;
                    }
                }
                if (flag == false) {
                    arr[i] = value;
                    i++;
                    System.out.println(value + " is unique");
                }
            } else {
                System.out.println("Try again");
                break;
            }
        }
        for (int numbers : arr) {
            System.out.print(numbers + " ");
        }
    }
}