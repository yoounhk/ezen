package week02.homework01;
public class Hw15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;

		int result = 0;

		while (tmp != 0) {
			result = result * 10 + (tmp % 10);
			tmp = tmp / 10;
		}

		System.out.println(result);
	}
}