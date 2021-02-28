package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Ту 154", 1983, 47, 51);
        Airplane airplane2 = new Airplane("Sukhoi SuperJet 100", 2019, 30, 25);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}