package task_4;

import java.security.SecureRandom;


public class 7_18 {

    public class Craps {
        private static final SecureRandom randomNumbers = new SecureRandom();

        private enum Status {CONTINUE, WON, LOST}

        ;
        private static final int SNAKE_EYES = 2;
        private static final int TREY = 3;
        private static final int SEVEN = 7;
        private static final int YO_LEVEN = 11;
        private static final int BOX_CARS = 12;
    }

    public static void main(String[] args) {
        int counterWins = 0;
        int counterLoses = 0;
        int myPoint = 0;
        Craps.Status gameStatus;
        for (int i = 0; i < 1000000; i++) {
            int sumOfDice = rollDice();
            switch (sumOfDice) {
                case Craps.SEVEN:
                case Craps.YO_LEVEN:
                    gameStatus = Craps.Status.WON;
                    break;
                case Craps.SNAKE_EYES:
                case Craps.TREY:
                case Craps.BOX_CARS:
                    gameStatus = Craps.Status.LOST;
                    break;
                default:
                    gameStatus = Craps.Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }
            while (gameStatus == Craps.Status.CONTINUE) {
                sumOfDice = rollDice();
                if (sumOfDice == myPoint)
                    gameStatus = Craps.Status.WON;
                else if (sumOfDice == Craps.SEVEN)
                    gameStatus = Craps.Status.LOST;
            }
            if (gameStatus == Craps.Status.WON) {
                System.out.println("Player wins");
                counterWins++;
            } else {
                System.out.println("Player loses");
                counterLoses++;
            }
            if (i == 0) {
                System.out.println("-----------------------------------------");
                System.out.println("Побед при первом броске: " + counterWins);
                System.out.println("Поражений при первом броске: " + counterLoses);
                System.out.println("-----------------------------------------");
            }
            if (i == 19) {
                System.out.println("-----------------------------------------");
                System.out.println("Побед при 20ом броске: " + counterWins);
                System.out.println("Поражений 20ом первом броске: " + counterLoses);
                System.out.println("-----------------------------------------");
            }
            if (i == 999999){
                System.out.println("-----------------------------------------");
                System.out.println("Всего побед " + counterWins);
                System.out.println("Всего поражений " + counterLoses);
                System.out.println("-----------------------------------------");
            }
        }
    }

    public static int rollDice() {
        int die1 = 1 + Craps.randomNumbers.nextInt(6);
        int die2 = 1 + Craps.randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
        return sum;
    }
}