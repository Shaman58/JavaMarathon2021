package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14Task1");
        printResult(file);
    }

    public static void printResult(File file) {
        double num = 0.0;
        int idx = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                num += scanner.nextInt();
                idx++;
            }
            double result = num / idx;
            System.out.printf("%.15f --> %.3f", result, result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не наден");
        }
    }
}