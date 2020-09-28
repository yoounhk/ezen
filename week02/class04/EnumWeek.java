package week02.class04;

import java.util.Calendar;

public class EnumWeek {
	public static void main(String[] args) {
		Week today;

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		default:
			today = null;
			break;
		}
		System.out.println("요일: " + today.toString());
		System.out.println("요일: " + today.name());
	}
}
