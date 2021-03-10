package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        csvToTxtMissingShoes(file);
    }

    public static void csvToTxtMissingShoes(File file) {
        List<String> shoes = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext())
                shoes.add(scanner.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("Файл shoes.csv не найден");
        }

        try {
            PrintWriter printWriter = new PrintWriter("src/main/resources/missing_shoes.txt");
            for (String string : shoes)
                if (Integer.parseInt(string.split(";")[2]) == 0)
                    printWriter.println(string.replace(";",", "));
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл missing_shoes.txt не найден");
        }

    }
}
