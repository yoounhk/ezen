package week03.class05.inheritance;

public class Main {
    public static void main(String[] args) {
        DMBCellPhone dmbCellPhone = new DMBCellPhone("자바폰", "검정", 10);

        System.out.println("dmbCellPhone.model = " + dmbCellPhone.model);
        System.out.println("dmbCellPhone.color = " + dmbCellPhone.color);

        System.out.println("dmbCellPhone.channel = " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요.");
        dmbCellPhone.receiveVoice("네. 전화받았습니다.");
        dmbCellPhone.sendVoice("네. 반갑습니다.");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDMB();
        dmbCellPhone.changeChannel(12);
        dmbCellPhone.turnOffDMB();
    }
}
