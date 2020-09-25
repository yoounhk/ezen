package week03.class05.inheritance;

public class DMBCellPhone extends CellPhone {

    int channel;

    public DMBCellPhone(String model, String color, int channel) {
        super(model,color);
        this.channel = channel;
    }

    void turnOnDMB() {
        System.out.println("Now Listening Channel " + channel +"...");
    }

    void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("Change Channel to " + this.channel +"...");
    }

    void turnOffDMB() {
        System.out.println("Stop Watching DMB..."); // 적절한 단어로 수정
    }

}
