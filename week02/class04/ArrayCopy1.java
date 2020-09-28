package week02.class04;

public class ArrayCopy1 {
    public static void main(String[] args) {
        int[] oldArray = { 1, 2, 3 };
        for (int i = 0; i < oldArray.length; i++) {
            System.out.printf("oldArray[%d] = %d\n", i, oldArray[i]);
        }

        int[] newArray = new int[5];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        System.out.println("---------------");

        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("newArray[%d] = %d\n", i, newArray[i]);
        }
    }
}