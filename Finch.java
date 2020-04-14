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
	
	public void eat() {
		for (int i=0; i<myWorld.getCreatureList().size(); i++) {
			if (myLocation.getX()==myWorld.getCreatureList().get(i).getMyLocation().getX()&&myLocation.getY()==myWorld.getCreatureList().get(i).getMyLocation().getY()) {
				String species2=myWorld.getCreatureList().get(i).getSpecies();
				if(species2.compareTo("Poison Berries")!=0&&species2.compareTo("Finch")!=0&&species2.compareTo("Dinosaur")!=0&&species2.compareTo("Human")!=0&&species2.compareTo("Cow")!=0) {
					myWorld.getCreatureList().get(i).setAge(500);
				}else if(species2.compareTo("Poison Berries")==0) {
					myAge=500;
				}
		
			}
			
		}
	}

}
