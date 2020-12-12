
import processing.core.PApplet;

public class Ship {

	float xPos;
	float yPos;
	float angle;
	float width = 50;
	
	Ship(float a,float x, float y) {
	angle = a;	
	xPos = x;
	yPos = y;
	} // end constructor
	
	void display(PApplet main) {
		main.pushMatrix();
		main.translate(xPos, yPos);
		main.rotate(angle);
		main.stroke(0);
		main.fill(0,0,0);
		main.triangle(-50,-40,-50, 40,50,0);
		main.popMatrix();
	} // end display
	

	
	void turn(float amount) {
		angle += amount;
	} // end turn
	
	void move(float amount) {
		xPos += 7* Math.cos(angle);
		yPos += 7* Math.sin(angle);
	} // end move
	
	float getAngle() {
		return angle;
	}// end getAngle

	public float getxPos() {
		return xPos;
	} // end getxPos

	public void setxPos(float xPos) {
		this.xPos = xPos;
	} // end setxPos

	public float getyPos() {
		return yPos;
	} // end getyPos

	public void setyPos(float yPos) {
		this.yPos = yPos;
	} // end setyPos

} //  end class ship
