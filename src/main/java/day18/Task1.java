package day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
//        int[] numbers = {};
        System.out.println(Arrays.toString(recursionSumV2(numbers)));
        System.out.println(recursionSum(numbers));
    }

    //с перегруженными методами
    public static int recursionSum(int[] numbers) {
        if (numbers.length == 0) return 0; // на случай массива без элементов
        return recursionSum(numbers, 1) + numbers[0];
    }

    public static int recursionSum(int[] numbers, int i) {
        if (i == numbers.length) return 0;
        return recursionSum(numbers, i + 1) + numbers[i];
    }

    //без перегруженных методов с возвратом массива с одним элементом суммы начального массива
    public static int[] recursionSumV2(int[] numbers) {
        if (numbers.length <= 1) return numbers;
        numbers[numbers.length - 2] += numbers[numbers.length - 1];
        return recursionSumV2(Arrays.copyOf(numbers, (numbers.length - 1)));
    }
}