package day8;

public class Task1 {
    public static void main(String[] args) {
        long start, finish;
        start = System.currentTimeMillis();
        concat();
//        System.out.println(concat());
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
        start = System.currentTimeMillis();
        stringBuilder();
//        System.out.println(stringBuilder());
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

    public static String concat() {
        String numbers = "";
        for (int i = 0; i <= 20000; i++)
            numbers = (numbers + " " + i);

        return numbers;
    }

    public static String stringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++)
            sb.append(" " + i);

        return sb.toString();
    }
}
