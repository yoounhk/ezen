package baekjoon;

import java.util.Scanner;

public class FourthPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[4];
		int[] y = new int[4];

		for (int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		// 한번 나온 수를 새로운 x,y로 한다
		if (x[0] == x[1]) {
			x[3] = x[2];
		} else if (x[1] == x[2]) {
			x[3] = x[0];
		} else if (x[0] == x[2]) {
			x[3] = x[1];
		}
		if (y[0] == y[1]) {
			y[3] = y[2];
		} else if (y[1] == y[2]) {
			y[3] = y[0];
		} else if (y[0] == y[2]) {
			y[3] = y[1];
		}
		System.out.println(x[3] + " " + y[3]);
	}
}
