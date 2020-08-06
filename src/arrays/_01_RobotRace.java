package arrays;

import java.awt.AWTException;
import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] robs = new Robot[10];
	boolean robotwon = false;
	for (int i = 0; i < robs.length; i++) {
		robs[i] = new Robot();
		robs[i].penDown();
		robs[i].setPenColor(Color.cyan);
		robs[i].setY(500);
		robs[i].setX(i * 150);
		robs[i].setSpeed(20);
	}
	Random rnd = new Random();
	while (true) {
		if (robotwon == true) {
			break;
			
		}
	for (int i = 0; i < robs.length; i++) {
		robs[i].move(rnd.nextInt(50));
		if (robs[i].getY() <= 50) {
			robotwon = true;
			robs[i].turn(90);
			robs[i].turn(90);
			robs[i].turn(90);
			robs[i].turn(90);
			robs[i].sparkle();
			break;
		}
	}
	}
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
