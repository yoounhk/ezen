package src.Ex16;

public class Main {
    public static void main(String[] args) {
        FireEngine fireEngine = new FireEngine();
        System.out.println(fireEngine instanceof FireEngine);
        System.out.println(fireEngine instanceof Movable);
        System.out.println(fireEngine instanceof Object);
        System.out.println(fireEngine instanceof Car);
//        System.out.println(fireEngine instanceof Ambulance);
    }
}


class Car{}
class FireEngine extends Car implements Movable {}
interface Movable {}
class Ambulance extends Car {}