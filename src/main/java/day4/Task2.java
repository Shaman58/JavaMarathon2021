package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 10000, max = 0, sum0 = 0, count0 = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(min);

        for (int el: array) {
            if (el > max)
                max = el;
            if (el < min)
                min = el;
            if (el % 10 == 0) {
                count0++;
                sum0 += el;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count0);
        System.out.println(sum0);
    }
}
