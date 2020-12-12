import processing.core.PApplet;

public class Restart {

	float xPos;
	float yPos;
	float width = 70;
	
	Restart(float x, float y) {
	xPos = x;
	yPos = y;
	} // end constructor
	
	void display(PApplet main) {
		main.stroke(0);
		main.fill(255,0,0);
		main.ellipse(xPos,yPos, width,width);
	} // end display

	
} // end class
