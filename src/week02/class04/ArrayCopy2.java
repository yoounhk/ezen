package week02.class04;

public class ArrayCopy2 {
	public static void main(String[] args) {
		String[] oldArray = {"java", "array", "copy"};
		String[] newArray = new String[5];
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for (int i = 0; i < oldArray.length; i++) {
			System.out.printf("[oldArray[%d] = \"%s\"]\t", i, oldArray[i]);
			System.out.printf("[newArray[%d] = \"%s\"]\n", i, newArray[i]);
		}
	}

}
