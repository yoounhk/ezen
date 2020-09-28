package week02.homework01;
public class Hw13 {
	public static void main(String[] args) {
		String value = "12o34";
		boolean isNumber = true;

		for (int i = 0; i < value.length(); i++)
			if (value.charAt(i) > '9' || value.charAt(i) < '0') {
				isNumber = false;
				break;
			}

		if (isNumber)
			System.out.println(value + ": 숫자");	
		else
			System.out.println(value + ": 문자");
	}
}
