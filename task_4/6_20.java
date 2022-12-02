package task_4;

import java.util.Scanner;

public class 6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("radius:");
        double radius = input.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга = " + area);
    }
}