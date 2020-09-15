package week02.homework01;

public class Hw01 {
	public static void main(String[] args) {
		int x = 15;
		char ch1 = 'a';
		char ch2 = 'x';
		char ch3 = '1';
		char ch4 = 'a';
		int year = 100;
		boolean powerOn = false;
		String str = "yes";

		boolean q1 = x > 10 && x < 20;
		boolean q2 = ch1 != ' ' || ch1 != '\t';
		boolean q3 = ch2 == 'x' || ch2 == 'X';
		boolean q4 = ch3 >= '0' && ch3 <= '9';
		boolean q5 = (ch4 >= 'a' && ch4 <= 'z') || (ch4 >= 'A' && ch4 <= 'Z');
		boolean q6 = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		boolean q7 = !powerOn;
		boolean q8 = str.equals("yes");

		System.out.println("q1 :" + q1);
		System.out.println("q2 :" + q2);
		System.out.println("q3 :" + q3);
		System.out.println("q4 :" + q4);
		System.out.println("q5 :" + q5);
		System.out.println("q6 :" + q6);
		System.out.println("q7 :" + q7);
		System.out.println("q8 :" + q8);

	}
}