package week03.homework03;

public class Hw23 {
    /*
     *(1) max메서드를 작성하시오.
     */
    private static int max(int[] data) {
        int max = Integer.MIN_VALUE;
        if (data == null || data.length == 0) return -999999;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) max = data[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[]{})); // 크기가 0인 배열
    }


}
