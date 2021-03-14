package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        readText();
    }

    // Чичиков - 601
    public static void readText() {
        Map<String, Integer> map = new HashMap<>();
        Set<Integer> maxValues;
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/dushi.txt"));
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            while (scanner.hasNext()) {
                String str = scanner.next();
                if (!map.containsKey(str))
                    map.put(str, 1);
                else map.put(str, map.get(str) + 1);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не нейден");
        }

        maxValues = new TreeSet<>(map.values());
        Integer[] sortedSetValues = maxValues.toArray(new Integer[0]);
        for (int i = sortedSetValues.length - 1; i > sortedSetValues.length - 100; i--) {
            System.out.printf("%-10s %d%n", getKeyToValue(map, sortedSetValues[i]), sortedSetValues[i]);
        }
    }

    private static String getKeyToValue(Map<String, Integer> map, int value) {
        for (Map.Entry<String, Integer> entry : map.entrySet())
            if (entry.getValue().equals(value)) return entry.getKey();
        return null;
    }
}
