//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
	
		
	Robot rob = new Robot();
	for(int i=0;i<10;i++) {
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("what color would you like");
		//5. Use an if/else statement to set the pen color that the user requested
if( color.equals("blue") ) {
	rob.setPenColor(Color.blue);
}
if( color.equals("red") ) {
	rob.setPenColor(Color.red);
}
if( color.equals("green") ) {
	rob.setPenColor(Color.green);
}


        //6. If the user doesn’t enter anything, choose a random color
if(color.equals("")) {
	rob.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setPenWidth(10);
		rob.penDown();
	    //2. Make the robot draw a shape (this will take more than one line of code)
	rob.setSpeed(1000);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(300);
rob.turn(90);
rob.move(300);rob.turn(90);
rob.move(300);rob.turn(90);
rob.move(300);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(300);
rob.turn(90);
rob.move(300);rob.turn(90);
rob.move(300);rob.turn(90);
rob.move(300);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(300);
rob.turn(90);
rob.move(300);rob.turn(90);
rob.move(300);rob.turn(90);
rob.move(300);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(300);
rob.turn(90);
rob.move(300);rob.turn(90);
rob.move(300);rob.turn(90);
rob.move(300);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(200);
rob.turn(90);
rob.move(300);
rob.turn(90);
rob.move(300);rob.turn(90);
rob.move(300);rob.turn(90);
rob.move(300);
rob.turn(90);
rob.move(200);
rob.turn(270);
rob.move(100);
rob.turn(270);
rob.move(500);
rob.turn(270);
rob.move(500);
rob.turn(270);
rob.move(500);
rob.turn(270);
rob.move(500);
	}
}
}