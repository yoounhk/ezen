

import java.util.Scanner;

class Qua11
{
	public static void main(String[] args)
	{
		// 1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random()*100) + 1; // 0~99.9999... + 1
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� �������� ����

		// ȭ������ ���� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ���
		java.util.Scanner s = new java.util.Scanner(System.in);

		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = s.nextInt(); // �Է¹��� ���� ���� input�� �����Ѵ�.

			if (input == answer) {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"�� �Դϴ�.");
			}
			else if (input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}
			else if (input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
		} while(true);
	}
}