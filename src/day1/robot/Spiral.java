package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot and set its pen to the down position
		Robot Machine= new Robot ();
		Machine.penDown();
		Machine.hide();
		// 3. Set the robot to go at max speed (10)
Machine.setSpeed(10000);
		// 4. Do the following (steps 5-8) 75 times
for (int i = 0; i < 75; i++) {
	
			// 6. Change the pen color to random
	Machine.setRandomPenColor();			// 5. Move the robot 5 times the current line number you are drawing (5*i)
	Machine.move(3*i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
	Machine.turn(360/3);
			// 7. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 8. Set the pen width to i
	Machine.setPenWidth(i);
	}
	}
}
