package week02.homework02;

public class Exercise5_2 {
	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10 }, { 20, 20, 20, 20 }, { 30, 30 } };
		System.out.println(arr[3].length);
		for (int i = 1; i <= 5; i++) {
			star(5 - i + 1);
		}
		int a = add(3, 5);
		System.out.println(a);
		int length = arr.length;
		System.out.println(length);
		int b = Integer.MAX_VALUE; // 상수
		int c = Math.min(3, 5);
		double pi = Math.PI;
		// int x = mul(3, 10); // main안의 x
		// System.out.println(x);
		// 1 부터 n 까지 더하는 함수 int로 반환하는 sum(n);
	}

	private static int cal(int a, int b, String str) {
		int result = a * b; // mul함수안의 x
		return result;
	}

	public static int add(int x, int y) {
		int r = x + y;
		return r;
	}

	public static void star(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
