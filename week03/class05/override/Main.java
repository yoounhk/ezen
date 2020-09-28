package week03.class05.override;

public class Main {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("calculator.areaCircle(r) = " + calculator.areaCircle(r));
        System.out.println();
        Computer computer = new Computer();
        System.out.println("computer.areaCircle(r) = " + computer.areaCircle(r));
        System.out.println();

        Calculator calculator1 = new Computer();
        System.out.println("calculator1.areaCircle(r) = " + calculator1.areaCircle(r));
        System.out.println("calculator1.getClass() = " + calculator1.getClass());
    }
}
