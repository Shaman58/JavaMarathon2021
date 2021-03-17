package SeaBattle;

import java.util.Scanner;

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
        System.out.println("Введите расположение кораблей.");
        for (int i = 0; i < ships.length; i++) {
            if (ships[i].getRank() == 1) {
                System.out.println("Введите координаты однопалубника. Формат ввода: a1");
                tryReadCoordinates(ships[i]);
            } else {
                System.out.printf("Введите координаты %s-палубника. Формат ввода: a1 e где литера означает направление(е - восток, w - запад, n - север, s - юг)", i);
            }
        }
    }

    private static void tryReadCoordinates(Ship ship) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] pos = inputDecompozition(scanner.nextLine());
            ship.setShip(pos[0], pos[1]);
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
}


//    private static void manuallyCreatePlayersShip(BufferedReader reader, int countOfDecker, int maxCountOfShip) throws IOException {
//        //count of created ships
//        int countOfShip = countOfDecker == 1 ? PlayersShips.countOfSubmarine : countOfDecker == 2 ?
//                PlayersShips.countOfDestroyer : countOfDecker == 3 ? PlayersShips.countOfCruiser : PlayersShips.countOfBattleShip;
//
//        while (countOfShip < maxCountOfShip) {
//            System.out.println(String.format("Create and place your %s!", countOfDecker == 1 ? "submarine" : countOfDecker == 2 ?
//                    "destroyer" : countOfDecker == 3 ? "cruiser" : "battleship"));
//
//            if (countOfDecker != 1) {
//                System.out.println("Write separate by spaces: coordinates, direction from this coordinates (n for north, e - east, s - south, w - west)" + NEWLINE + "Example: d2 e");
//            } else {
//                System.out.println("Write: coordinates" + NEWLINE + "Example: d2");
//            }
//
//            String parameters = reader.readLine();
//            // exit for exit from game.
//            if ("exit".equals(parameters.toLowerCase())) {
//                System.exit(0);
//            }
//
//            String[] param =  parameters.split("[ ]+");
//            String coordinates = param[0];
//            int number;
//            int letter;
//            try {
//                letter = Character.toLowerCase(coordinates.charAt(0)) - 97;                      // a=0, b=1, c=2, d=3, e=4,f=5, g=6, h=7, i=8, j=9 .....
//                number = Integer.parseInt(coordinates.substring(1, coordinates.length())) - 1;   // 1 => 0
//            } catch (NumberFormatException e) {
//                System.out.println("You need to use space to separate coordinates and direction! Try again");
//                manuallyCreatePlayersShip(reader, countOfDecker, maxCountOfShip);
//                break;
//            }
//            // Check coordinates, that they valid
//            if ((number < 0 || number > sizeOfField - 1 ) || (letter < 0 || letter > sizeOfField - 1)){
//                System.out.println("Coordinates might be from a to j and from 1 to 10! Try again");
//                manuallyCreatePlayersShip(reader, countOfDecker, maxCountOfShip);
//                break;
//            }
//            //If creating ship is battleship, or Cruise, or Destroyer
//            if (countOfDecker > 1) {
//                //If we have directions parameter
//                if (param.length > 1) {
//                    char direction = param[1].charAt(0);
//                    // Check the direction
//                    if (direction != 'n' && direction != 'e' && direction != 's' && direction != 'w'){
//                        System.out.println("direction is wrong might be n for north, e - east, s - south, w - west");
//                        manuallyCreatePlayersShip(reader, countOfDecker, maxCountOfShip);
//                        break;
//                    }
//                    // create ship and set parameters
//                    PlayersShips playersShip = new PlayersShips();
//                    playersShip.setShip(direction, countOfDecker, number, letter);
//                    printPlayersField();
//                    countOfShip = countOfDecker == 2 ? PlayersShips.countOfDestroyer : countOfDecker == 3 ? PlayersShips.countOfCruiser : PlayersShips.countOfBattleShip;
//                } else {
//                    System.out.println("You have forgot write a direction! Try again");
//                    manuallyCreatePlayersShip(reader, countOfDecker, maxCountOfShip);
//                    break;
//                }
//                // If creating ship is Submarine
//            } else {
//                // create submarine and set parameters
//                PlayersShips playersShip = new PlayersShips();
//                playersShip.setShip(number, letter);
//                printPlayersField();
//                countOfShip = PlayersShips.countOfSubmarine;
//            }
//        }
//    }
