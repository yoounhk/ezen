package week02.homework03;

public class Hw07 {
    static class MyPoint {
        int x;
        int y;

        MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        /*
         * (1) 인스턴스 메서드 getDistance()를 작성하시오.
         */
        public double getDistance(int x, int y) {
            return Math.sqrt(Math.pow(x - this.x, 2)
                    + Math.pow(y - this.y, 2));
        }

    }

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        // p와 (2,2)의 거리를 구한다.
        System.out.println(p.getDistance(2, 2));
    }
}
