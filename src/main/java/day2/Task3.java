package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a, b, idx;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a >= b)
            System.out.println("Некорректный ввод");
        idx = a;
        while (++idx < b) {
            if (idx % 5 == 0 && idx % 10 != 0)
                System.out.print(idx + " ");
        }
    }
}
