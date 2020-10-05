
public class Exercise7_18 {
	/*
		(1) action메서드를 작성하시오.
	*/
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i< arr.length;i++)
			action(arr[i]);
	} // main

}
