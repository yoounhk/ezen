package week02.homework01;
public class Hw04 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 1000; i++) {
			if (i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
			if (sum >= 100) {
				System.out.println(i);
				return;
			}
		}
	}
}

