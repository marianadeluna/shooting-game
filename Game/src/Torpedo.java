
import processing.core.PApplet;

public class Torpedo {

	float xPos;
	float yPos;
	float angle;
	float width = 15;
	
	Torpedo(float x, float y, float a) {
	angle = a;	
	xPos = x;
	yPos = y;
	} // end constructor
	
	void display(PApplet main) {
		main.stroke(178,255,102);
		main.fill(178,255,102);
		main.ellipse(xPos, yPos,width,width);
	} // end display
	
	void update() {
		xPos += 7* Math.cos(angle);
		yPos += 7* Math.sin(angle);
	} // end update
	
	float getXPos() {
		return xPos;
	}// end getXPos
	
	float getYPos() {
		return yPos;
	}// end getYPos
	
	float getWidth() {
		return width;
	}// end getWidth
	
} // end class Torpedo
