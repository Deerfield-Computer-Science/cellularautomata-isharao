import java.awt.Color;
import java.util.ArrayList;

public class Flower extends Plant {
	
	public Flower(Location l, World w) {
		super(l,w);
		myLifeSpan = 2;
		myColor= Color.YELLOW;
		species= "Flower";
	}
	
	public void reproduce() {
		// this is silly code really, but as an example
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new Grass(new Location(newX,newY), myWorld));
	}

}