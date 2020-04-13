import java.awt.Color;

public class Human extends LifeForm {

	public Human(String species,int myLifeSpan, Location myLocation, Color myColor, World myWorld) {
		super(species, myLifeSpan, myLocation, myColor, myWorld);
	}
	
	public Human(Location myLocation,World myWorld) {
		super(myLocation, myWorld);
		species= "Human";
	}

	@Override
	public void reproduce() {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		myWorld.getCreatureList().add(new Human(new Location(newX,newY), myWorld));
		
	}

}
