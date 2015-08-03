package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Machine= new Robot ();
Machine.setPenColor(Color.blue);
Machine.penDown();
Machine.setSpeed(1000000);
for (int i = 0; i < 10000; i++) {
	Machine.move(20);
	Machine.turn(1);
}	


	}
}
