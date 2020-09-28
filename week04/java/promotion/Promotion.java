package promotion;

public class Promotion {


    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b; // Type: A -> B
        A a2 = c; // Type: A -> C
        A a3 = d; // Type: A -> B -> D
        A a4 = e; // Type: A -> C -> E

        B b1 = d; // Type: B -> D
        C c1 = e; // Type: C -> E

        //B b2 = e; (x): 상속 관계가 아님
        //C b2 = d; (x): 상속 관계가 아님
    }
}

class A{}

class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}