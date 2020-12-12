
import processing.core.PApplet;
import java.util.ArrayList;

public class ParticleSystem {
	
	ArrayList<Particle> particleList = new ArrayList<>();

	float xOrigin;
	float yOrigin;
	
	ParticleSystem(float x, float y, int numParticles){
		xOrigin = x;
		yOrigin = y;
		
		while (particleList.size() < numParticles) {
			particleList.add( new Particle(x,y,(float) Math.random() *2 -1, (float) Math.random() *2-1));
		} // end while
	} // end constructor
	
	void display(PApplet main) {
		for (int index=0; index < particleList.size();index++) {
			Particle theParticle = particleList.get(index);
			theParticle.display(main);
		} // end for
	} // end display

	void run() {
		for (int index = particleList.size()-1; index>=0;index--) {
		Particle theParticle=particleList.get(index);
		if (theParticle.isAlive()) {
			theParticle.run();
		} else {
			particleList.remove(theParticle);
		} // end if
	} // end for
	} // end run
	
} // end class
