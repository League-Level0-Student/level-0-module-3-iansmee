package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
static	Robot bob = new Robot();
public static void main(String[] args) {
	
	
	
	
	String shape = JOptionPane.showInputDialog(null,"what shape would you like (square, Triangle, or circle)?");
	
	String color = JOptionPane.showInputDialog(null,"what color would you like(red, green, or blue)");
	Color answer = Color.RED;
	if(color .equals ("red")) {
		answer = Color.RED;
		bob.setPenColor(Color.RED);
	}
	if(color .equals ("blue")) {
		answer = Color.blue;
		bob.setPenColor(Color.BLUE);
	}
	if(color .equals ("green")) {
		answer = Color.green;
		bob.setPenColor(Color.GREEN);
	}
	
	if(shape .equals("square") ) {
		drawSquare(answer);
	}
	if(shape .equals("triangle")) {
		drawTriangle(answer);
	}
	if(shape .equals("circle")) {
		drawCircle(answer);
	}
	
}
static void drawSquare(Color answer) {
	
	
	bob.setSpeed(100);
	bob.penDown();
	
	bob.move(90);
	bob.turn(90);
	bob.move(90);
	bob.turn(90);
	bob.move(90);
	bob.turn(90);
	bob.move(90);
	bob.turn(90);
	
	bob.penUp();
	bob.move(200);
}
static void drawTriangle(Color answer) {

	
	bob.setSpeed(100);
	bob.penDown();
	
	bob.move(100);
	bob.turn(120);
	bob.move(100);
	bob.turn(120);
	bob.move(100);
	bob.turn(120);
	
	bob.penUp();
	bob.move(200);
}
static void drawCircle(Color answer) {

	
	bob.setSpeed(100);
	bob.penDown();
	
	for (int i = 0; i < 120; i++) {
		bob.move(3);
		bob.turn(3);
	}
	bob.penUp();
	bob.move(200);
	
}
}
