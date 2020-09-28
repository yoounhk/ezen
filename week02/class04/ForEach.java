package week02.class04;

public class ForEach {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int sum = 0;
		for (int i : a) { // 인덱스용 변수 없이 a의 값 변경 불가
			i = 1;
			sum += i;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("sum = " + sum);
	}
}
