package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

//        randomNumbersToFile(file1);
//        numbersToFile2(file1, file2);
        randomNumbersToFileAndSumToFile2(file1, file2);
        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            double sum = 0;
            Scanner scanner = new Scanner(file);
            scanner.useLocale(Locale.US);
            while (scanner.hasNextDouble())
                sum += scanner.nextDouble();
            System.out.println((int) sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void randomNumbersToFileAndSumToFile2(File file1, File file2) {
        try {
            PrintWriter pw1 = new PrintWriter(file1);
            PrintWriter pw2 = new PrintWriter(file2);
            Random random = new Random();
            int sumOf20 = 0;
            for (int i = 0; i < 1000; i++) {
                int rand = random.nextInt(100);
                sumOf20 += rand;
                pw1.println(rand);
                if (i % 20 == 0) {
                    pw2.println((double) sumOf20 / 20);
                    sumOf20 = 0;
                }
            }
            pw1.close();
            pw2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void randomNumbersToFile(File file) {
        try {
            PrintWriter pw = new PrintWriter(file);
            Random random = new Random();
            for (int i = 0; i < 1000; i++)
                pw.println(random.nextInt(100));
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void numbersToFile2(File file1, File file2) {
        try {
            PrintWriter pw = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);
            scanner.useLocale(Locale.US);
            int sum = 0, idx = 0;
            while (scanner.hasNext()) {
                if (idx++ % 20 == 0) {
                    pw.println((double) sum / 20.0);
                    sum = 0;
                }
                sum += scanner.nextInt();
            }
            scanner.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
