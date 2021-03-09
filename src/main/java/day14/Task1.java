package day14;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14Task1");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            int sum = 0, count = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
                count++;
            }
            if (count == 10)
                System.out.println(sum);
            else throw new IOException();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный файл");
        }
    }
}
