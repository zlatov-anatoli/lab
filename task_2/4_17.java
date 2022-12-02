package task_2;

import java.util.Scanner;

public class 4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gallons = 0;
        int miles = 0;
        float res = 0;
        float sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter gallons and miles\n");
            System.out.print("galons:");
            gallons = input.nextInt();
            System.out.print("miles:");
            miles = input.nextInt();
            res = (float) miles / gallons;
            sum +=res;
            System.out.println("Miles per gallon: " + res);
        }
        System.out.println("Общее количество милей на галлон:"+sum);

    }
}