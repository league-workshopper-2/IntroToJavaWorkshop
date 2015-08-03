package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Machine= new Robot ();

	void go() {
		// 4. Make the robot move as fast as possible
Machine.setSpeed(10);
		// 5. Set the pen width to 5
Machine.setPenWidth(5);
		// 6. Do steps #6 to #7 four times...
for (int i = 0; i < 4; i++) {
	Machine.setRandomPenColor();
	drawSquare();
	Machine.turn(360/4);
}
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method

			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
for (int i = 0; i < 4; i++) {
	Machine.penDown();
	Machine.move(150);
	Machine.turn(360/5);
}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
