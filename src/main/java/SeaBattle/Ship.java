package SeaBattle;

import java.util.List;

public class Ship {
    private int rank;
    private Position[] position;
    List<Position> shipArea;

    public Ship(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setShip(int x, int y) {

    }

    public boolean setShip(int x, int y, int rank, char direction) {
        switch (direction) {
            case 'n':
                if ((y - rank) < 1)
                    errorMessage();
                else {
                    position = new Position[rank];
                    for (int i = 0; i < rank; i++)
                        position[i] = new Position(x, y - i);
                }
                return true;
            case 's':
                if ((y + rank) > Field.HEIGHT)
                    errorMessage();
                else {
                    position = new Position[rank];
                    for (int i = 0; i < rank; i++)
                        position[i] = new Position(x, y + i);
                }
                return true;
            case 'w':
                if ((x - rank) < 1)
                    errorMessage();
                else {
                    position = new Position[rank];
                    for (int i = 0; i < rank; i++)
                        position[i] = new Position(x - i, y);
                }
                return true;
            case 'e':
                if ((x + rank) > Field.WIDTH)
                    errorMessage();
                else {
                    position = new Position[rank];
                    for (int i = 0; i < rank; i++)
                        position[i] = new Position(x + i, y);
                }
                return true;
            default:
                System.out.println("Ошибка ввода!!! Напрвление не распознано. Повторите!");
                return false;

        }
    }

    private void fillShipArea() {

    }

    private static void errorMessage(){
        System.out.println("Ошибка ввода!!! Корабль не умещатся на поле. Повторите!");
    }
}
