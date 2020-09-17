package week02.baekjoon;

import java.util.Scanner;

public class ACMHotel_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int w, h, n;
		int floor;
		int roomNumber;
		String[] result = new String[t];
		for (int i = 0; i < t; i++) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			floor = n % h;
			roomNumber = n / h + 1;
			if (n % h == 0) {
				floor = h;
				roomNumber = n / h;
			}
			result[i] = Integer.toString(floor);
			if (roomNumber < 10) {
				result[i] += "0";
			}
			result[i] += roomNumber;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}