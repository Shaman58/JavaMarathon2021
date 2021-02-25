package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 0, max = 0, sum0 = 0, count0 = 0;
        int[] array = new int[100];
        for (int i = 0; i<array.length; i++) {
            array[i] = random.nextInt(10000);
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
            if (array[i] % 10 == 0) {
                count0++;
                sum0 += array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count0);
        System.out.println(sum0);
    }
}
