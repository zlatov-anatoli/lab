package task_3;

import java.util.Scanner;

public class 5_17 {
    public static void main(String[] args) {
        double firstItem = 2.98;
        double secondItem = 4.50;
        double thirdItem = 9.98;
        double fourthItem = 4.49;
        double fifthItem = 6.87;
        double sum = 0;
        int i = 0;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите общее кол-во проданных товаров  :");
        int count = input.nextInt();
        while (flag) {
            System.out.println("Введите номер товара, который был продан 1/2/3/4/5");
            int variable = input.nextInt();
            switch (variable) {
                case 1:
                    sum += firstItem;
                    i++;
                    if (i == count) {
                        flag = false;
                    }
                    break;
                case 2:
                    sum += secondItem;
                    i++;
                    if (i == count) {
                        flag = false;
                    }
                    break;
                case 3:
                    sum += thirdItem;
                    i++;
                    if (i == count) {
                        flag = false;
                    }
                    break;
                case 4:
                    sum += fourthItem;
                    i++;
                    if (i == count) {
                        flag = false;
                    }
                    break;
                case 5:
                    sum += fifthItem;
                    i++;
                    if (i == count) {
                        flag = false;
                    }
                    break;
            }
        }
        System.out.println("Сумма всех проданных товаров : " + sum);
    }
}