

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*Teacher­led. Before starting, make sure every student has imported their Module 0 Java
Project into Eclipse. Check that all programs are closed but students have selected the
default package in the Eclipse Package Explorer.
Instruct students to do the following ­ check student screens to monitor understanding.
Help students who are stuck, but note lack of mastery. 
          1. Create a new Java class called Checkpoint
          2. Add a main method to the class
          3. Code a pop­up dialog to ask the user for their favorite color, 
          e.g. “red”
          4. Code another pop­up dialog to tell the user that the color they typed is also
your favorite color, 
          e.g. “red is also my favorite color”
          5. Draw a triangle on the screen using a Robot object (Hint: turn angle = 120).
EXTRA: For students who complete activity quickly, have them try to turn the name of
the color into a matching pen color and have the robot draw the triangle in that color.
This is NOT part of the checkpoint! */

public class module0checkpoint {
	public static void main(String[] args) {
	 Robot rob = new Robot();
	 rob.penDown();
	 rob.setRandomPenColor();
	 rob.setSpeed(50);
	String color =	JOptionPane.showInputDialog(null, "what is your favorite color");
		JOptionPane.showMessageDialog(null, color +  "  is also my favorite color");
		
		for(int i =0; i<3; i++) {
			if(color.equals("red")) {
									
			rob.setPenColor(Color.RED);
			}
			if(color.equals("blue")) {
				
			rob.setPenColor(Color.BLUE);
			}
			if(color.equals("black")) {
				
			rob.setPenColor(Color.BLACK);
			}
			if(color.equals("pink")) {
					
			rob.setPenColor(Color.PINK);
			}
			rob.move(100);
	 rob.turn(120);
}
	}
}