package task_2;

import java.util.Scanner;

public class 4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers");
        arr[0] = input.nextInt();
        for (int i = 1; i < arr.length; i++) {
            arr[i] = input.nextInt();
            for (int x = 0; x < i; x++) {
                if (arr[i] == arr[x]) {
                    System.out.println("Такое число уже есть введите другое число");
                    arr[i] = input.nextInt();

                }
            }

        }
        input.close();
        int buffer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int l = 0; l < arr.length; l++) {
                if (arr[i] < arr[l]) {
                    buffer = arr[i];
                    arr[i] = arr[l];
                    arr[l] = buffer;
                    //break;
                }

            }


        }

        System.out.println("Первое самое большое число: " + arr[9] + "\nВторое самое большое число: " + arr[8]);
    }
}