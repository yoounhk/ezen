package src.Ex15;

public class Main {
    public static void main(String[] args) {
        Unit unit = new GroundUnit();
        Tank tank = new Tank();
        AirCraft airCraft = new AirCraft();

        GroundUnit groundUnit = (GroundUnit)unit;
    }
}

class Unit {
    private int field;
}
class AirUnit extends Unit {}
class GroundUnit extends Unit {}
class Tank extends GroundUnit {}
class AirCraft extends AirUnit{}