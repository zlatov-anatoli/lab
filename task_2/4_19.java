package task_2;

import java.util.Scanner;

public class 4_19 {
    public static void main(String[] args) {
        double firstItem = 239.99;
        double secondItem = 129.75;
        double thirdItem = 99.95;
        double fourthItem = 350.89;
        int sum = 0;
        int i = 0;
        int salary = 0;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во проданных товаров за неделю :");
        int count = input.nextInt();
        while (flag) {
            System.out.println("Введите номер товара, который был продан 1/2/3/4");
            int variable = input.nextInt();
            switch (variable) {
                case 1:
                    sum += firstItem;
                    i++;
                    if (i == count) {
                        flag = false;
                    }
                case 2:
                    sum += secondItem;
                    i++;
                    if (i == count) {
                        flag = false;
                    }
                case 3:
                    sum += thirdItem;
                    i++;
                    if (i == count) {
                        flag = false;
                    }
                case 4:
                    sum += fourthItem;
                    i++;
                    if (i == count) {
                        flag = false;
                    }
            }
        }
        salary = 200 + ((sum * 9) / 100);
        System.out.println("Зарпалата с учетом комиссионых:" + salary);

    }
}