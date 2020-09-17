package week02.homework01;
public class Hw03 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += sum(i);
		}
		System.out.println(total);
	}

	public static int sum(int n) {
		return (n + 1) * n / 2;
	}
}
