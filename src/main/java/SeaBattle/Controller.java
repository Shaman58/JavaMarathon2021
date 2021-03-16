package SeaBattle;

public class Controller {
    private static Field player1Field = new Field();
    private static Field player2Field = new Field();

    public static void main(String[] args) {
        showField(player1Field, player2Field);
    }

    private static void showField(Field field1, Field field2) {
        System.out.printf("\t\t\t\t\t   1  2  3  4  5  6  7  8  9 10\t\t\t\t\t\t   1  2  3  4  5  6  7  8  9 10%n");

        for (int i = 0; i < Field.WIDTH; i++) {
            showLineOfField(field1, i);
            showLineOfField(field2, i);
            System.out.println();
        }
    }

    private static void showLineOfField(Field field, int i) {
        System.out.printf("\t\t\t\t\t%2d", (i + 1));
        for (int j = 0; j < Field.HEIGHT; j++) {
            System.out.print("[ ]");
        }
    }
}
