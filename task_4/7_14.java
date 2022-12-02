package task_4;

public class 7_14 {
    public static void main(String[] args) {
        System.out.println("2 arguments " + product(2, 3));
        System.out.println("3 arguments " + product(2, 3, 4));
        System.out.println("4 arguments " + product(2, 3, 4, 5));
        System.out.println("5 arguments " + product(2, 3, 4, 5, 6));
    }

    public static int product(int... value) {
        int total = 1;
        for (int number : value) {
            total *= number;
        }
        return total;
    }
}