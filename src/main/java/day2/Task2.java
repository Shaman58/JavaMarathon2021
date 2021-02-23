package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a >= b)
            System.out.println("Некорректный ввод");

        for (int i = a+1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0)
                System.out.print(i + " ");
        }
    }
}
