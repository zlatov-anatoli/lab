package task_4;

import java.security.SecureRandom;
import java.util.Scanner;

public class 6_29 {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Coin {HEADS, TAILS}

    public static void main(String[] args) {
        boolean flag = true;
        int headsCounter = 0;
        int tailsCounter = 0;
        Scanner input = new Scanner(System.in);
        while (flag == true) {
            System.out.println("1 - Подбросить монетку\n2 - Остановиться\n");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    dice();
                    if (dice() == Coin.HEADS) {
                        headsCounter++;
                    } else {
                        tailsCounter++;
                    }
                    break;
                case 2:
                    System.out.println("Heads : " + headsCounter);
                    System.out.println("Tails : " + tailsCounter);
                    flag = false;
                    break;
            }
        }
    }

    public static Coin dice() {
        int face = 1 + randomNumbers.nextInt(2);
        switch (face) {
            case 1:
                return Coin.HEADS;
            case 2:
                return Coin.TAILS;
        }
        return null;
    }

}