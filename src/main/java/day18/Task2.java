package day18;

public class Task2 {


    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int number) {
        String str[] = Integer.toString(Math.abs(number)).split("");
        int idx = 0;
        int count = 0;

        if (Integer.parseInt(str[idx]) == 7) {
            count++;
        }
        return count7(str, ++idx, count);
    }

    private static int count7(String [] str, int idx, int count) {
        if (str.length == idx)
            return count;
        if (Integer.parseInt(str[idx]) == 7) {
            count++;
        }
        return count7(str, ++idx, count);
    }
}