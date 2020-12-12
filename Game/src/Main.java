
import processing.core.PApplet;
import java.util.ArrayList;

public class Main extends PApplet {

	Ship ship;
	float score = 0;

	ArrayList<Torpedo> torpedoList = new ArrayList <Torpedo>();
	ArrayList<Asteroids> asteroidList = new ArrayList <Asteroids>();
	ArrayList<ParticleSystem> systemList = new ArrayList <ParticleSystem>();

	public void setup() {
		ship = new Ship(0, width/2, height/2);
		while (asteroidList.size() < 20) {
			asteroidList.add(new Asteroids(random(-100,800),random(-700,0)));
		}// end while
	} // end setup
	
	public void settings() {
		size(1000,600);
	} // end settings
	
	public void draw() {
		background(200);
		
		ship.display(this);
		textSize(24);
		text(score, 100, 100);
		for (ParticleSystem system: systemList){
			system.display(this);
			system.run();
		} // end for
		for (Torpedo torpedo: torpedoList) {
			torpedo.display(this);
			torpedo.update();
		}// end for
		for (Asteroids asteroids: asteroidList) {
			asteroids.display(this);
			asteroids.update();
		}// end for
		Collision();
		GameOver();
	} // end draw
	
	public void Collision() {
		for(int asteroidIndex = asteroidList.size()-1; asteroidIndex>=0;asteroidIndex--){
			Asteroids asteroid = asteroidList.get(asteroidIndex);

		boolean asteroidHit = false;
		for (int index=torpedoList.size()-1;index>=0; index--) {
			Torpedo torpedo = torpedoList.get(index);
			if(collide(asteroid,torpedo)) {
				torpedoList.remove(torpedo);
				asteroidHit = true;
				score += 10;
				systemList.add(new ParticleSystem(torpedo.getXPos(),torpedo.getYPos(),100));
			} // end if
		} // end for
		if (asteroidHit) {
			asteroidList.remove(asteroid);
		} // end if
		
		if (collide(asteroid,ship)) {
			systemList.add(new ParticleSystem(ship.getxPos(), ship.getyPos(),100));
			fill(255);
			textSize(150);
			text("Game Over",100,150);
			textSize(24);
			text("press Enter to restart",400,500);
		} // end if
		} // end for
	} // end Collision
	
	boolean collide(Asteroids asteroid, Torpedo torpedo) {
		if(dist(asteroid.getXPos(), asteroid.getYPos(), torpedo.getXPos(), torpedo.getYPos())
				<asteroid.getWidth()/2 + torpedo.getWidth()/2){
			return true;
		} else {
			return false;
		} // end if
	} // end collide
	
	public void GameOver() {
		for(int asteroidIndex = asteroidList.size()-1; asteroidIndex>=0;asteroidIndex--){
			Asteroids asteroid = asteroidList.get(asteroidIndex);
			
			boolean shipHit = false;
			if (collide(asteroid,ship)) {
				fill(255);
				textSize(150);
				text("Game Over",100,150);
				textSize(24);
				text("press Enter to restart",400,500);
			} // end if
			
			if (shipHit) {
			//	ship.remove();
				systemList.add(new ParticleSystem(ship.getxPos(), ship.getyPos(),100));
			} // end if
			} // end for
	
	} // end GameOver
	
	
	boolean collide(Asteroids asteroid, Ship ship) {
		if(dist(asteroid.getXPos(), asteroid.getYPos(), ship.getxPos(), ship.getyPos())
				< asteroid.getWidth()/2 + 50) {
			return true;
		} else {
			return false;
		} // end if
	} // end collide
	
	
	public void keyPressed() {
		if (key == ' ') {
			torpedoList.add(new Torpedo(ship.getxPos() + 50 *cos(ship.getAngle()),
					ship.getyPos() + 40 * sin(ship.getAngle()),
					ship.getAngle()));
		} else if (key == CODED){
			if (keyCode == LEFT) {
				ship.turn(-0.1f);
			} else if (keyCode == RIGHT) {
				ship.turn(0.1f);
			} else if (keyCode == UP) {
				ship.move(1);
			} // end if
		}// end if
		
	} // end keyPressed
	
	public static void main(String[] args) {
		PApplet.main("Main");
	} // end main
	
} // end Main class
