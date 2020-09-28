package week02.homework01;

public class Hw10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("sum=" + sum);
	}
}
