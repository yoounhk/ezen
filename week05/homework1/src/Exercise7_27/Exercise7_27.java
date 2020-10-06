package src.Exercise7_27;

class Outer {
    int value = 10;

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;
            System.out.println(/* (1) */);
            System.out.println(/* (2) */);
            System.out.println(/* (3) */);
        }
    } // Inner클래스의 끝
} // Outer클래스의 끝

class Exercise7_27 {
    public static void main(String[] args) {
		/*
			(4) 알맞은 코드를 넣어 완성하시오.
		*/

        inner.method1();
    }
}