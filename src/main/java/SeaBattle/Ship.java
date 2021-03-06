package SeaBattle;

import java.util.HashSet;
import java.util.Set;

public class Ship {
    private int rank;
    private Position[] positions;
    private Set<Position> shipArea;

    public Ship(int rank) {
        this.rank = rank;
        positions = new Position[rank];
    }


    public Set<Position> getShipArea() {
        return shipArea;
    }

    public int getRank() {
        return rank;
    }

    public Position[] getPositions() {
        return positions;
    }

    public void setPositions(Position[] positions) {
        this.positions = positions;
    }

    public void setShipArea(Set<Position> shipArea) {
        this.shipArea = shipArea;
    }

    public boolean setShip(int x, int y) {
        positions[0] = new Position(x, y);
        fillShipArea();
        return true;
    }

    public boolean checkAlive() {
        for (Position position : positions)
            if (!position.isFired()) return true;
        return false;
    }

    public boolean setShip(int y, int x, int rank, char direction) {
        switch (direction) {
            case 'n':                                  //нужно как то вынести повторяющийся код в отдельный метод
                if ((x - rank) < 1) {
                    errorMessage();
                    return false;
                } else {
                    positions = new Position[rank];
                    for (int i = 0; i < rank; i++)
                        positions[i] = new Position(x - i, y);
                    fillShipArea();
                    return true;
                }
            case 's':
                if ((x + rank) > Field.HEIGHT) {
                    errorMessage();
                    return false;
                } else {
                    positions = new Position[rank];
                    for (int i = 0; i < rank; i++)
                        positions[i] = new Position(x + i, y);
                    fillShipArea();
                    return true;
                }
            case 'w':
                if ((y - rank) < 1) {
                    errorMessage();
                    return false;
                } else {
                    positions = new Position[rank];
                    for (int i = 0; i < rank; i++)
                        positions[i] = new Position(x, y - i);
                    fillShipArea();
                    return true;
                }
            case 'e':
                if ((y + rank) > Field.WIDTH) {
                    errorMessage();
                    return false;
                } else {
                    positions = new Position[rank];
                    for (int i = 0; i < rank; i++)
                        positions[i] = new Position(x, y + i);
                    fillShipArea();
                    return true;
                }
            default:
                System.out.println("Ошибка ввода!!! Напрвление не распознано. Повторите!");
                return false;
        }
    }


    private void fillShipArea() {
        shipArea = new HashSet<>();
        for (Position position : positions) {
            int x = position.getX();
            int y = position.getY();
            for (int i = x - 1; i < x + 2; i++)
                for (int j = y - 1; j < y + 2; j++)
                    shipArea.add(new Position(i, j));
        }
    }

    private static void errorMessage() {
        System.out.println("Ошибка ввода!!! Корабль не умещатся на поле. Повторите!");
    }

    @Override
    public String toString() {
        return "Ship{" +
                "rank=" + rank +
                '}';
    }
}