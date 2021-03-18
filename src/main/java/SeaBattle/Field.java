package SeaBattle;

import java.util.Scanner;

public class Field {
    public static final int WIDTH = 10;
    public static final int HEIGHT = 10;
    private Ship[] ships = {
            new Ship(1),
            new Ship(3),
            new Ship(3),
            new Ship(2),
            new Ship(2),
            new Ship(2),
            new Ship(4),
            new Ship(1),
            new Ship(1),
            new Ship(1)
    };
    private Position[] enemyShots;

    public Ship[] getShips() {
        return ships;
    }

    public Position[] getEnemyShots() {
        return enemyShots;
    }


    public void createPlayerField() {
        System.out.println("Введите расположение кораблей.");
        for (int i = 0; i < ships.length; i++) {
            if (ships[i].getRank() == 1) {
                System.out.println("Введите координаты однопалубника. Формат ввода: a1");
                tryReadCoordinates(ships[i]);
            } else {
                System.out.printf("Введите координаты %sх-палубника. Формат ввода: a1 e где литера означает направление(е - восток, w - запад, n - север, s - юг)%n", ships[i].getRank());
                tryReadCoordinates(ships[i], ships[i].getRank());
            }
        }
    }

    private static void tryReadCoordinates(Ship ship) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] pos = inputDecompozition(scanner.nextLine());
            checkValidPosition(pos);
            ship.setShip(pos[0], pos[1]);
        } catch (NumberFormatException exception) {
            System.out.println("Неправильный формат данных!");
            tryReadCoordinates(ship);
        }
    }

    private static void tryReadCoordinates(Ship ship, int rank) {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] str = scanner.nextLine().split(" ");
            int[] pos = inputDecompozition(str[0]);
            checkValidPosition(pos);
            if (ship.setShip(pos[0], pos[1], ship.getRank(), (str[1]).charAt(0))) throw new NumberFormatException();
        } catch (NumberFormatException exception) {
            System.out.println("Неправильный формат данных!");
            tryReadCoordinates(ship);
        }
    }

    private static int[] inputDecompozition(String input) {
        int x, y;

        x = Character.toLowerCase(input.charAt(0)) - 97;
        y = Integer.parseInt(input.substring(1, 2)) - 1;

        return new int[]{x, y};
    }

    private static void checkValidPosition(int[] pos) {
        if (pos[0] >= Field.WIDTH || pos[0] < 0 || pos[1] >= Field.HEIGHT || pos[1] < 0) {
            throw new NumberFormatException();
        }
    }
}