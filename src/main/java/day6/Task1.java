package day6;

public class Task1 {
    public static void main(String[] args) {
        MotorBike bike = new MotorBike(1991, "red", "Suzuki Bandit 400");
        bike.info();
        System.out.println(bike.yearDifference(2005));
    }
}
