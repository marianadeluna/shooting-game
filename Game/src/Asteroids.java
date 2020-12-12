
import processing.core.PApplet;

public class Asteroids {
	
	float xPos;
	float yPos;
	float angle;
	float width = 25;
	
	Asteroids(float x, float y) {
	xPos = x;
	yPos = y;
	} // end constructor
	
	void display(PApplet main) {
		main.stroke(0);
		main.fill(127);
		main.ellipse(xPos, yPos,width,width);
	} // end display
	
	void update() {
		xPos += 0.5f* Math.random();
		yPos += 2* Math.random();
		
		if (yPos > 600) {
			yPos = 0;
		} // end if
		if (xPos > 1000) {
			yPos = 0;
		}// end if
	} // end update
	
	float getXPos() {
		return xPos;
	}// end getXPos
	
	float getYPos() {
		return yPos;
	}// end getYPos
	
	float getWidth() {
		return width;
	} // end getWidth
	
} // end class Asteroids
