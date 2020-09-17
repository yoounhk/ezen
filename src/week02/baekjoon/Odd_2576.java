package week02.baekjoon;

import java.util.Scanner;

public class Odd_2576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 7;
		int[] a = new int[n];
		int minOdd = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] % 2 != 0) {
				minOdd = Math.min(a[i], minOdd);
				sum += a[i];
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(minOdd);
		}
	}
}
