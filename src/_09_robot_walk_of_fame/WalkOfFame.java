
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot bob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
bob.setX(100);
		// 2. Make the robot draw a star shape. Hint: 144.
bob.setSpeed(100);

bob.penDown();
for (int i = 0; i < 5; i++) {
	bob.move(30);
	bob.turn(144);
}
bob.penUp();
bob.move(50);
bob.penDown();
for (int i = 0; i < 5; i++) {
	bob.move(30);
	bob.turn(144);
}
bob.penUp();
bob.move(50);
bob.penDown();
for (int i = 0; i < 5; i++) {
	bob.move(30);
	bob.turn(144);
}
bob.penUp();
bob.move(50);
bob.penDown();
for (int i = 0; i < 5; i++) {
	bob.move(30);
	bob.turn(144);
}
bob.penUp();
bob.move(50);
bob.penDown();
for (int i = 0; i < 5; i++) {
	bob.move(30);
	bob.turn(144);
}
bob.penUp();
bob.move(50);
bob.penDown();
for (int i = 0; i < 5; i++) {
	bob.move(30);
	bob.turn(144);
}
bob.penUp();
bob.move(50);
bob.penDown();
// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */
JOptionPane.showMessageDialog(null, "");
	}

}
