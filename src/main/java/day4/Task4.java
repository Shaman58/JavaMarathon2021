package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int maxsum = 0, index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        for (int i = 0; i < array.length - 2; i++) {
            int sum = array[i] + array[i + 1] + array[i + 2];
            if (maxsum <= sum) {
                maxsum = sum;
                index = i;
            }
        }
        System.out.printf("%d\n%d", maxsum, index);
    }
}
