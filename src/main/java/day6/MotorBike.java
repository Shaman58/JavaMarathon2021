package day6;

public class MotorBike {
    private int year;
    private String color, model;

    public MotorBike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return Math.abs(this.year - year);
    }
}
