package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        randomNumbersToFile(file1);
        numbersToFile2(file1, file2);
    }

    public static void randomNumbersToFile(File file) {
        try {
            PrintWriter pw = new PrintWriter(file);
            Random random = new Random();
            for (int i = 0; i < 1000; i++)
                pw.print(random.nextInt(100) + " ");
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void numbersToFile2(File file1, File file2) {
        try {
            PrintWriter pw = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);
            int sum = 0, idx = 0;
            while (scanner.hasNext()) {
                if (idx++ == 20) {
                    pw.println((double) sum / 20);
                    idx = 0;
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
