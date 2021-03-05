package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("AUDI");
        cars.add("volkswagen");
        cars.add("KIA");
        cars.add("BMW");
        cars.add("Volvo");

        System.out.println(cars);
        cars.add(2, "Ford");
        cars.remove(0);
        System.out.println(cars);
    }
}
