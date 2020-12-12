
import processing.core.PApplet;

public class Particle {
	
	float xPos;
	float yPos;
	
	float xDir;
	float yDir;
	
	float age = 1;
	float lifeSpan = 255;
	float width = 10;
	
	Particle(float x, float y, float xD, float yD) {
		xPos = x;
		yPos = y;
		xDir = xD;
		yDir = yD;
	} // end constructor
	
	void display(PApplet main) {
		main.stroke(255,0,0);
		main.fill(255,0,0,255-2*age);
		main.ellipse(xPos, yPos, width, width);
	} // end display
	
	void update() {
		xPos = xPos + xDir;
		yPos = yPos + yDir;
	} // end update
	
	void run() {
		update();
		age++;
	} //  end run
	
	float getXPos() {
		return xPos;
	}// end getXPos
	
	float getYPos() {
		return yPos;
	}// end getYPos
	
	float getWidth() {
		return width;
	}// end getWidth
	
	boolean isAlive() {
		return age < lifeSpan;
	} // end isAlive
	
} // end class
