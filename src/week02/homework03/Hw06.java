package week02.homework03;

public class Hw06 {

    public static void main(String args[]) {
        System.out.println(getDistance(1, 1, 2, 2));
    }

    // 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
    private static double getDistance(int x, int y, int x1, int y1) {
        /*
         * (1) 알맞은 코드를 넣어 완성하시오.
         */
        return Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2));
    }
}
