package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		int sep = 50;
		Random rand = new Random();
		boolean gameOver = false;
		
		
		//2. create an array of 5 robots.
		Robot r2[] = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < r2.length; i++) {
			r2[i] = new Robot("mini");
			//4. make each robot start at the bottom of the screen, side by side, facing up
			r2[i].moveTo(50+sep, 500);
			sep = sep+50;
			r2[i].setSpeed(10);
			
		}
		
			while (!gameOver) {
				//5. use another for loop to iterate through the array and make each robot move 
			    //   a random amount less than 50.
				for (int j = 0; j < r2.length; j++) {
					r2[j].move(rand.nextInt(50));
					r2[j].turn(5);
					if(r2[j].getY() > 550) {
						gameOver = true;
					}
				}
			}
		

		
		
	}
		
	
		

			
	
		
    	
		

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
