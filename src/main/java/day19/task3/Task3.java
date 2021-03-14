package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) {
        Map<Integer, Point> taxiCars = loadTaxiCars();
        taxiSearch(taxiCars);
    }


    // внаглую скопипасчен с класса DisplayTaxiMap и доработан
    private static Map<Integer, Point> loadTaxiCars() {
        Map<Integer, Point> taxiCars = new HashMap<>();

        try {
            File file = new File("src/main/resources/taxi_cars.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                int[] taxiCar = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                taxiCars.put(taxiCar[0], new Point(taxiCar[1], taxiCar[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return taxiCars;
    }

    private static void taxiSearch(Map<Integer, Point> taxiCars) {
        List<Integer> idTaxi = new ArrayList<>();
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        Point point1, point2;

        //логика ужасная, даж я это вижу. Обработчик правильности ввода не стал изобретать
        //Вставил самый тупой.
        do {
            System.out.println("Введите Х и У 1й точки");
            point1 = new Point(scanner.nextInt(), scanner.nextInt());
            System.out.println("Введите Х и У 2й точки");
            point2 = new Point(scanner.nextInt(), scanner.nextInt());
        } while (point1.getX() > point2.getX() || point1.getY() < point2.getY());

        for (Map.Entry<Integer, Point> entry : taxiCars.entrySet()) {
            if (entry.getValue().getX() > point1.getX() && entry.getValue().getY() < point1.getY() && entry.getValue().getX() < point2.getX() && entry.getValue().getY() > point2.getY()) {
                counter++;
                idTaxi.add(entry.getKey());
            }
        }

        System.out.println("id такси в зоне:");
        for (Integer id : idTaxi)
            System.out.println(id);

        System.out.println("Такси в зоне: " + counter);
    }

}

