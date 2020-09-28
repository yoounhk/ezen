package final_keyword;

public class SportsCar extends Car {
    @Override
    public void speedUp() {speed+=10;}

    /* final method 는 override 할 수 없음
    @Override
    public void stop() {
        System.out.println("Sports car stop");
        speed = 0;
    }
    */
}
