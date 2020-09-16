package baekjoon;

import java.util.Scanner;

public class Cute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cute = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1)
                cute++;
        }
        if (cute > n / 2)
            System.out.println("Junhee is cute!");
        else
            System.out.println("Junhee is not cute!");
    }
}
