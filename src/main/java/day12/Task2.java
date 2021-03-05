package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        addNumbers(numbers, 0, 30);
        addNumbers(numbers, 300, 350);
        System.out.println(numbers);
    }

    public static void addNumbers(List<Integer> numbers, int min, int max) {
        for (int i = min; i < max; i++)
            if (i % 2 == 0)
                numbers.add(i);
    }
}
