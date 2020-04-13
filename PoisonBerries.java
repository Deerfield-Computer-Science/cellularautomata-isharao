import java.awt.Color;
import java.util.ArrayList;

public class PoisonBerries extends Plant {
	
	public PoisonBerries(Location l, World w) {
		super(l,w);
		myLifeSpan = 2;
		myColor= Color.MAGENTA;
	}
	
	public void reproduce() {
		if (mySex==1) {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new Grass(new Location(newX,newY), myWorld));
	}
	}

}
