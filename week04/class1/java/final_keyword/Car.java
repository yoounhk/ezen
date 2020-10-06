package final_keyword;

public class Car {
    public int speed;

    public void speedUp() {speed++;}

    public final void stop() {
        System.out.println("stop");
        speed = 0;
    }
}
