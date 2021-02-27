package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike("Suzuki Bandit 400", "red", 1991);
        bike.info();
        System.out.println(bike.yearDifference(2005));
    }
}
