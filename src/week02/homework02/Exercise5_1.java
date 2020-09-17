package week02.homework02;

public class Exercise5_1 {
	public static void main(String[] args) {
		int[] b = { 1, 2, 3 };
		// 틀린 코드
		// int[] c[] = new int[3][];

		int[] array = { 1, 2, 3, 4, 5 }; // 같은타입만 묶는거야
		// 2번째 특징 순서가 있다
		// 3번째는 길이가 만들때 정해져
		// 0부터 시작
		int[][] a = new int[9][9];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = i * j;
				System.out.printf("%d * %d = %d\t", i, j, a[i][j]);
			}
			System.out.println();
			System.out.println();
		}
	}
}