package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int eq1 = 0, more8 = 0, even = 0;
        int[] array = new int[new Scanner(System.in).nextInt()]; // так делают?
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if(array[i] == 1)
                eq1++;
            if(array[i] > 8)
                more8++;
            if(array[i]%2 == 0)
                even++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + more8);
        System.out.println("Количество чисел равных 1: " + eq1);
        System.out.println("Количество четных чисел: "+ even);
        System.out.println("Количество нечетных чисел: "+ (array.length-even));
    }
}
