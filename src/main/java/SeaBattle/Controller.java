package SeaBattle;

import java.util.Arrays;

public class Controller {
    private static Field player1Field = new Field();
    private static Field player2Field = new Field();

    public static void main(String[] args) {
        showFields(player1Field, player2Field);
    }

    private static void showFields(Field field1, Field field2) {
        System.out.printf("\t\t\t\t\t   A  B  C  D  E  F  G  H  I  J\t\t\t\t\t\t   A  B  C  D  E  F  G  H  I  J%n");

        for (int i = 0; i < Field.WIDTH; i++) {
            showLineOfField(field1, i);
            showLineOfField(field2, i);
            System.out.println();
        }

        String s = "a1 s";
        String[] pos = s.split(" ");
        int x = Character.toLowerCase(pos[0].charAt(0)) - 97;
        int y = Integer.parseInt(pos[0].substring(1, 2)) - 1;
    }

    private static void showLineOfField(Field field, int i) {
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
}
