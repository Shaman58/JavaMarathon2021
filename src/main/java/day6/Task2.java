package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Ту 154", 1983, 48, 51);
        airplane.setYear(1984);
        airplane.setLength(49);
        airplane.fillUp(55);
        airplane.fillUp(43);
        airplane.info();
    }
}
