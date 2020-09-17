package week02.baekjoon;

import java.util.Scanner;

public class Cook_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 5;
        int col = 4;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int winner = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += sc.nextInt();
            }
            if (sum > max) {
                max = sum;
                winner = i + 1;
            }
            sum = 0;
        }

        System.out.println(winner + " " + max);
    }

}
