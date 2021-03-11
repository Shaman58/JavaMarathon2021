package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        csvToTxtMissingShoes(file);
    }

    public static void csvToTxtMissingShoes(File file) {
        String stringShoes;
        try {
            PrintWriter printWriter = new PrintWriter("src/main/resources/missing_shoes.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                stringShoes = scanner.nextLine();
                if (Integer.parseInt(stringShoes.split(";")[2]) == 0)
                    printWriter.println(stringShoes.replace(";", ", "));
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл missing_shoes.txt не найден");
        }

    }
}
