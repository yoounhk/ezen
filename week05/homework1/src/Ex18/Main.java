package src.Ex18;

public class Main {

    public static void action(Robot robot) {
        if (robot instanceof DanceRobot) ((DanceRobot) robot).dance();
        else if(robot instanceof SingRobot) ((SingRobot) robot).sing();
        else if(robot instanceof DrawRobot) ((DrawRobot) robot).draw();
    }

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (int i = 0; i < arr.length; i++)
            action(arr[i]);
    }
}
