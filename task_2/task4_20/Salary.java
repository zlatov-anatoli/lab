package task_2.task4_20;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Employee first = new Employee();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите цену за 1 час работы :");
        int grossPerHour = input.nextInt();
        System.out.println("Введите кол-во часов за прошлую неделю: ");
        int hoursPerWeek = input.nextInt();
        first.setHoursPerWeek(hoursPerWeek);
        first.setGrossPerHour(grossPerHour);
        first.grossPay();

    }
}