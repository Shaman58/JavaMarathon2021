package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors;
        floors = scanner.nextInt();

        if (1 <= floors && floors <= 4)
            System.out.println("Малоэтажный дом");
        else if (5 <= floors && floors <= 8)
            System.out.println("Среднеэтажный дом");
        else if (floors >= 9)
            System.out.println("Многоэтажный дом");
        else System.out.println("Ошибка ввода");
    }
}
