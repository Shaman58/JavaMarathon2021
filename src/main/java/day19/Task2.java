package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/numbers19.txt");
        numbersCounter(file);
    }

    public static void numbersCounter(File file) {
        Set<Integer> numbers = new HashSet<>();
        int count = 0;

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext())
                numbers.add(scanner.nextInt());
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        for (int i = 500_000_000; i <= 600_000_000; i++) {
            if (numbers.contains(i))
                count++;
        }

        System.out.println(count);
    }
}
