package task_4;

import java.util.Scanner;

public class 6_22 {
    static double celsius = 0;
    static double fahrenheit = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Чтобы ввести температуру Цельсиях введите 1 , для Фарегейта 2 ");
        int value = input.nextInt();
        switch (value) {
            case 1:
                System.out.println("Введите градусы в Цельсиях:");
                double celsius = input.nextDouble();
                System.out.println("Эквивалент в Фаренгейтах :"+fahrenheit(celsius));
                break;
            case 2:
                System.out.println("Введите градусы в Фаренгйтах:");
                fahrenheit = input.nextDouble();
                System.out.println("Эквивалент в Цельсиях :"+celsius(fahrenheit));
                break;
        }
    }

    public static double celsius(double fahrenheit) {
        return celsius = 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return fahrenheit = 9.0 / 5.0 * celsius + 32;
    }
}