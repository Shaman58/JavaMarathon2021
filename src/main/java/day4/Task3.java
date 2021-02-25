package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();
        int nline = 0, summax = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sumline = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
                sumline += matrix[i][j];
            }
            if (sumline >= summax){
                summax = sumline;
                nline = i;
            }
        }
        System.out.println(nline);
    }
}
