package week02.baekjoon;

import java.util.Scanner;

public class Plug_2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int input = 0;
        for (int i = 0; i < n; i++) {
            input = sc.nextInt();
            total += input;
        }
        System.out.println(total - n + 1);
    }
}
