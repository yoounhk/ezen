package src.Ex07;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println("child.x = " + child.x);
    }
}

class Parent {
    int x = 100;
    Parent() {
        this(200);
        System.out.println("Parent.Parent()");
    }
    Parent(int x) {
        this.x = x;
        System.out.println("Parent.Parent(int x)");
    }

    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 3000;

    Child() {
        this(1000);
        System.out.println("Child.Child()");
    }

    Child(int x) {
        this.x = x;
        System.out.println("Child.Child(int x)");
    }
}