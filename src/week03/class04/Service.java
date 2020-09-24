package week03.class04;

public class Service {
    public static void main(String[] args) {

    }

    @PrintAnnotation(value = "+",number = 10)
    public void method1() {
        System.out.println("메소드1 실행 됨");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("메소드2 실행 됨");

    }

    @PrintAnnotation
    public void method3() {
        System.out.println("메소드3의 시작");

    }

}
