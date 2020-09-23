package week02.homework03;

public class Hw20 {

    /*
     * (1) shuffle() 메서드를 작성하시오.
     */
    private static int[] shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rnd = (int)(Math.random()*arr.length);
            int tmp = arr[i];
            arr[i] = arr[rnd];
            arr[rnd] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }


}
