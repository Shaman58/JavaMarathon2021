package SeaBattle;

public class Field {
    public static final int WIDTH = 10;
    public static final int HEIGHT = 10;
    private Ship[] ships = {
            new Ship(4),
            new Ship(3),
            new Ship(3),
            new Ship(2),
            new Ship(2),
            new Ship(2),
            new Ship(1),
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
        for (int i = 0; i < ships.length; i++) {
            if (ships[i].getRank() == 1)
                ships[i].setShip(0, 0);
            else ships[i].setShip(0, 0, ships[i].getRank(), 'n');
        }
    }
}
