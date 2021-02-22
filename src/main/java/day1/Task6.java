package day1;

public class Task6 {
    public static void main(String[] args) {
        final int k = 3;
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d", i, k, (i * k));
            System.out.println();
        }
    }
}
