package SeaBattle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    private List<Position> enemyShots = new ArrayList<>();

    public Ship[] getShips() {
        return ships;
    }

    public List<Position> getEnemyShots() {
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

    private void tryReadCoordinates(Ship ship) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int[] pos = inputDecompozition(scanner.nextLine());
                checkValidPosition(pos);
                ship.setShip(pos[1], pos[0]);
                showFields(this, this);
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Неправильный формат данных!");
            }
        }
    }

    private void tryReadCoordinates(Ship ship, int rank) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String[] str = scanner.nextLine().split(" ");
                int[] pos = inputDecompozition(str[0]);
                checkValidPosition(pos);
                System.out.println(pos[0] + " " + pos[1] + " " + rank + " " + (str[1]).charAt(0));
                if (ship.setShip(pos[0], pos[1], rank, (str[1]).charAt(0))) {
                    showFields(this, this);
                    break;
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException exception1) {
                System.out.println("Неправильный формат данных!");
            }
        }
    }

    private boolean chekShipAreaCollision(Ship ship) {
        boolean flag = false;
        for (int i = 0; i < ships.length; i++)
            if (ship != ships[i])
                for (Position pos : ship.getPositions())
                    if (ships[i].getShipArea().contains(pos))
                        flag = true;
        return flag;
    }

    private static int[] inputDecompozition(String input) {
        int x, y;

        x = Character.toLowerCase(input.charAt(0)) - 97;
        y = Integer.parseInt(input.substring(1, input.length())) - 1;

        return new int[]{x, y};
    }

    private static void checkValidPosition(int[] pos) {
        if (pos[1] >= Field.WIDTH || pos[1] < 0 || pos[0] >= Field.HEIGHT || pos[0] < 0) {
            throw new NumberFormatException();
        }
    }

    private static void showFields(Field field1, Field field2) {
        System.out.printf("\t\t\t\t\t   A  B  C  D  E  F  G  H  I  J\t\t\t\t\t\t   A  B  C  D  E  F  G  H  I  J%n");

        for (int i = 0; i < Field.WIDTH; i++) {
            showLineOfFieldShips(field1, i);
            showLineOfFieldEnemyFire(field2, i);
            System.out.println();
        }
    }

    private static void showLineOfFieldShips(Field field, int i) {
        System.out.printf("\t\t\t\t\t%2d", (i + 1));
        String out = "[ ]";
        for (int j = 0; j < Field.HEIGHT; j++) {
            Position checkPos = new Position(i, j);
            for (Ship ship : field.getShips()) {
                for (Position pos : ship.getPositions()) {
                    if (Arrays.asList(pos).contains(checkPos)) {
                        if (!(field.getEnemyShots() == null) && Arrays.asList(field.getEnemyShots()).contains(checkPos)) {
                            out = "[X]";
                        } else out = "[#]";
                    }
                }
            }
            System.out.print(out);
            out = "[ ]";
        }
    }

    private static void showLineOfFieldEnemyFire(Field field, int i) {
        System.out.printf("\t\t\t\t\t%2d", (i + 1));
        String out = "[ ]";
        for (int j = 0; j < Field.HEIGHT; j++) {
            if (field.getEnemyShots().contains(new Position(i, j)))
                out = "[•]";
            System.out.print(out);
            out = "[ ]";
        }
    }

}