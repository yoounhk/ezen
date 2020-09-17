package week02.baekjoon;

import java.util.Scanner;

public class Bill_5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = 9;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            total -= a[i];
        }
        System.out.println(total);
    }
}
