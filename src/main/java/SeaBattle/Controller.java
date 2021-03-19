package SeaBattle;


import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    private static Field player1Field = new Field("Player1");
    private static Field player2Field = new Field("Player2");

    public static void main(String[] args) {
        player1Field.createPlayerField(player2Field);
        cls();
        player2Field.createPlayerField(player1Field);
        startGame();
    }

    private static boolean shipFire(Field pl1Field, Field pl2Field) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s отвернись!%n", pl2Field.getName());
        while (true) {
            System.out.println("Нажми Enter");
            scanner.nextLine();
            cls();
            System.out.printf("%s Стреляй! (Формат ввода: a1)%n", pl1Field.getName());
            Field.showFields(pl1Field, pl2Field);
            try {
                int[] pos = Field.inputDecompozition(scanner.nextLine());
                Field.checkValidPosition(pos);
                Position checkPos = new Position(pos[1], pos[0]);
                pl2Field.getEnemyShots().add(checkPos);
                if (checkHit(pl2Field, checkPos)) {
                    pl2Field.setHitPoint(pl2Field.getHitPoint() - 1);
                    if (pl2Field.getHitPoint() <= 0) {
                        System.out.printf("Победа!!! %s вы победили!!!%n", pl1Field.getName());
                        return true;
                    }
                } else break;

            } catch (NumberFormatException | StringIndexOutOfBoundsException exception1) {
                System.out.println("Неправильный формат данных!");
            }
        }
        return false;
    }

    private static boolean checkHit(Field field, Position position) {
        for (Ship ship : field.getShips())
            if (Arrays.asList(ship.getPositions()).contains(position)) {
                for (Position pos : ship.getPositions())
                    if (pos.equals(position))
                        pos.setFired();

                if (ship.checkAlive()) {
                    System.out.println("Попадание!");
                } else {
                    System.out.println("Корабль затоплен!!!");
                }
                System.out.println("Стреляйте снова!");
                return true;
            }
        System.out.println("Промах!");
        return false;
    }

    private static void startGame() {
        while (true) {
            if (shipFire(player1Field, player2Field)) {
                break;
            }
            if (shipFire(player2Field, player1Field)) {
                break;
            }
        }
    }

    private static void cls() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}
