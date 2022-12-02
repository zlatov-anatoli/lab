package task_4;

import java.security.SecureRandom;

public class 7_17 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int dice1, dice2;
        int[] frequency = new int[13];

        for (int i = 0; i < 36000000; i++) {
            dice1 = 1 + random.nextInt(6);
            dice2 = 1 + random.nextInt(6);
            ++frequency[dice1 + dice2];
        }
        System.out.printf("Sum\tFrequency\n");
        for (int i = 2; i < frequency.length; i++) {
            System.out.printf("%3d\t%9d\n", i, frequency[i]);
        }
    }
}