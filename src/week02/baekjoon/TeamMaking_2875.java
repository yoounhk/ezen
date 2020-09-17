package week02.baekjoon;

import java.util.Scanner;

public class TeamMaking_2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int team = 0;
        while (n >= 2 && m >= 1 && n + m >= k + 3) {
            n -= 2;
            m -= 1;
            team++;
        }
        System.out.println(team);
    }
}
