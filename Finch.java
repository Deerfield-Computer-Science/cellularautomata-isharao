import java.awt.Color;

import acm.util.RandomGenerator;

public class Finch extends Animal {

	public Finch(Location myLocation, World myWorld) {
		super(myLocation,myWorld);
		myColor= Color.ORANGE;
		myLifeSpan = 5;
		species= "Finch";

	}
	@Override
	public void reproduce() {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		myWorld.getCreatureList().add(new Cow(new Location(newX,newY), myWorld));
	}
	
	public void move(int i) {
		int myX = myWorld.getCreatureList().get(i).getMyLocation().getX();
		int myY = myWorld.getCreatureList().get(i).getMyLocation().getY();
		Location loc = new Location(myX+1, myY+1);
		myWorld.getCreatureList().get(i).setMyLocation(loc);
	}
	
	public void eatGrass() {
	
	}

}
