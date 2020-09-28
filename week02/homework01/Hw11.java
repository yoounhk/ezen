package week02.homework01;
public class Hw11 {
	public static void main(String[] args) {
		int[] fib = new int[10 + 1];
		fib[1] = 1;
		fib[2] = 1;
		for (int i = 3; i < fib.length; i++)
			fib[i] = fib[i - 2] + fib[i - 1];
		for (int i = 1; i < fib.length; i++)
			System.out.println(fib[i]);
	}
}
