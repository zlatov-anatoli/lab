package task_3;

import java.util.Scanner;

public class 5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int smallest = 0;
        System.out.printf("Введите кол-во значений: \n");
        int value = input.nextInt();
        while (counter < value) {
            System.out.printf("Введите ваше число: \n");
            int number = input.nextInt();
            if(smallest == 0){
                smallest = number;
            }
            if (number<smallest){
                smallest = number;
            }
            counter++;
        }
        System.out.printf("Наименьшее число:%d%n",smallest);
    }
}