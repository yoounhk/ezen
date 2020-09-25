package week03.class05.inheritance;

public class CellPhone {
    String model;
    String color;

    public CellPhone(String model, String color) {
        this.model =model;
        this.color = color;
    }

    void powerOn() {
        System.out.println("Power On");
    }
    void powerOff() {
        System.out.println("Power Off");
    }
    void bell() {
        System.out.println("Ring Ring");
    }
    void sendVoice(String message) {
        System.out.println("Me: "+ message);
    }
    void receiveVoice(String message) {
        System.out.println("Opponent : " + message);
    }
    void hangUp() {
        System.out.println("Hang Up...");
    }
}
