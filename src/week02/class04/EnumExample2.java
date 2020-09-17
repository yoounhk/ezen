package week02.class04;

import java.util.Scanner;

public class EnumExample2 {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		String toString = today.toString();
		System.out.println(name);
		System.out.println(toString);

		int ordinal = today.ordinal();
		System.out.println(ordinal);

		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("대문자 요일 입력: ");
		String str = sc.nextLine();
		Week weekDay = Week.valueOf(str);
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말");
		}
		else {
			System.out.println("평일");
		}
		int[] a[];
	}
}
