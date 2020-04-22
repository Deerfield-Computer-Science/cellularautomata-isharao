import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class WorldController extends GraphicsProgram {
	
	private World world1;
	private World world2;
	private World world3;
	private World world4;
	private GCanvas theWorldCanvas;
	public static final int APPLICATION_WIDTH = 1000;
	public static final int APPLICATION_HEIGHT = 1000;
	
	public void run(){	
		setUpWorld();
		runWorld();
		System.out.println("Finished running main");
	}
	
	public void init(){
	    resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}
	
	public void setUpWorld() {
		world1= new World (20,20);
		world2= new World (20,20);
		world3= new World (20,20);
		world4= new World (20,20);
		world1.getCreatureList().add(new Grass(new Location(3,6), world1 ));
		world1.getCreatureList().add(new Grass( new Location(4,6), world1 ));
		world1.getCreatureList().add(new Grass( new Location(11,6), world1 ));
		world1.getCreatureList().add(new Grass( new Location(12,6), world1 ));
		world1.getCreatureList().add(new Grass(new Location(10,5), world1 ));
		world1.getCreatureList().add(new Grass( new Location(1,13), world1 ));
		world1.getCreatureList().add(new Grass( new Location(8,10), world1 ));
		world1.getCreatureList().add(new Grass( new Location(1,13), world1 ));
		world1.getCreatureList().add(new Grass( new Location(12,5), world1 ));
		world1.getCreatureList().add(new Grass( new Location(7,8), world1 ));
		world1.getCreatureList().add(new Cow( new Location(2,2), world1 ));
		world1.getCreatureList().add(new Cow( new Location(4,2), world1 ));
		world1.getCreatureList().add(new Cow( new Location(2,5), world1 ));
		world1.getCreatureList().add(new Dinosaur(new Location (3,12), world1));
		world1.getCreatureList().add(new Dinosaur(new Location (9,6), world1));
		world1.getCreatureList().add(new Dinosaur(new Location (2,4), world1));
		world1.getCreatureList().add(new Dinosaur(new Location (2,13), world1));
		world1.getCreatureList().add(new Dinosaur(new Location (8,7), world1));
		world1.getCreatureList().add(new Dinosaur(new Location (9,7), world1));
		world1.getCreatureList().add(new PoisonBerries(new Location (6,4), world1));
		world1.getCreatureList().add(new PoisonBerries(new Location (6,5), world1));
		world1.getCreatureList().add(new PoisonBerries(new Location (3,9), world1));
		world1.getCreatureList().add(new PoisonBerries(new Location (8,4), world1));
		world1.getCreatureList().add(new PoisonBerries(new Location (7,5), world1));
		world1.getCreatureList().add(new PoisonBerries(new Location (10,9), world1));
		world1.getCreatureList().add(new Mushroom(new Location (1,5), world1));
		world1.getCreatureList().add(new Mushroom(new Location (4,9), world1));
		world1.getCreatureList().add(new Mushroom(new Location (10,5), world1));
		world1.getCreatureList().add(new Mushroom(new Location (14,9), world1));
		world1.getCreatureList().add(new Mushroom(new Location (12,5), world1));
		world1.getCreatureList().add(new Mushroom(new Location (11,9), world1));
		world1.getCreatureList().add(new Finch(new Location (3,2), world1));
		world1.getCreatureList().add(new Finch(new Location (3,10), world1));
		world1.getCreatureList().add(new Finch(new Location (12,6), world1));
		world1.getCreatureList().add(new Finch(new Location (8,7), world1));
		world1.getCreatureList().add(new Finch(new Location (4,2), world1));
		world1.getCreatureList().add(new Finch(new Location (7,4), world1));
		world1.getCreatureList().add(new Human(new Location (12,1), world1));
		world1.getCreatureList().add(new Human(new Location (0,2), world1));
		world1.getCreatureList().add(new Human(new Location (7,10), world1));
		world1.getCreatureList().add(new Human(new Location (0,15), world1));
		world1.getCreatureList().add(new Human(new Location (1,13), world1));
		world1.getCreatureList().add(new Human(new Location (2,12), world1));
		world1.getCreatureList().add(new Flower(new Location (1,3), world1));
		world1.getCreatureList().add(new Flower(new Location (10,8), world1));
		world1.getCreatureList().add(new Flower(new Location (10,9), world1));
		world1.getCreatureList().add(new Flower(new Location (11,3), world1));
		world1.getCreatureList().add(new Flower(new Location (4,8), world1));
		world1.getCreatureList().add(new Flower(new Location (6,9), world1));
		world1.getCreatureList().add(new Flower(new Location (1,3), world1));
		world1.getCreatureList().add(new Flower(new Location (14,8), world1));
		world1.getCreatureList().add(new Flower(new Location (2,9), world1));
		world1.getCreatureList().add(new Flower(new Location (0,3), world1));
		world1.getCreatureList().add(new Flower(new Location (2,8), world1));
		world1.getCreatureList().add(new Flower(new Location (10,9), world1));
		

		theWorldCanvas = this.getGCanvas();
	}
	
	public void runWorld(){
		drawWorld();
		for(int i=0; i<50;i++){
			world1.letTimePass();
			world2.letTimePass();
			world3.letTimePass();
			world4.letTimePass();
			pause(500);
			drawWorld();
		}
	}	
	
	public void drawWorld(){
		drawBlankWorld();
		drawCreatures();
	}
	
	public void drawBlankWorld(){
		for(int row = 0 ; row<world1.getWidth(); row++) {
			for(int col=0; col<world1.getHeight(); col++){
				GRect r = new GRect(row*20, col*20, 20, 20);
				r.setFillColor(Color.WHITE);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
		}
		for(int row = 0 ; row<world2.getWidth(); row++) {
			for(int col=20; col<world2.getHeight()+20; col++){
				GRect r = new GRect(row*20,col*20,20,20);
				r.setFillColor(Color.WHITE);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
		}
		for(int row = 20 ; row<world3.getWidth()+20; row++) {
			for(int col=0; col<world3.getHeight(); col++){
				GRect r = new GRect(row*20, col*20, 20, 20);
				r.setFillColor(Color.WHITE);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
		}
		for(int row = 20 ; row<world4.getWidth()+20; row++) {
			for(int col=20; col<world4.getHeight()+20; col++){
				GRect r = new GRect(row*20,col*20,20,20);
				r.setFillColor(Color.WHITE);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
		}
	}
	
	
	public void drawCreatures(){
		for(LifeForm x: world1.getCreatureList()){
			GRect r = new GRect (x.getMyLocation().getX()*20, x.getMyLocation().getY()*20,20,20);
			r.setFillColor(x.getMyColor());
			r.setFilled(true);
			theWorldCanvas.add(r);
		}
		for(LifeForm x: world2.getCreatureList()){
			GRect r = new GRect (x.getMyLocation().getX()*20, x.getMyLocation().getY()*20,20,20);
			r.setFillColor(x.getMyColor());
			r.setFilled(true);
			theWorldCanvas.add(r);
		}
		for(LifeForm x: world3.getCreatureList()){
			GRect r = new GRect (x.getMyLocation().getX()*20, x.getMyLocation().getY()*20,20,20);
			r.setFillColor(x.getMyColor());
			r.setFilled(true);
			theWorldCanvas.add(r);
		}
		for(LifeForm x: world4.getCreatureList()){
			GRect r = new GRect (x.getMyLocation().getX()*20, x.getMyLocation().getY()*20,20,20);
			r.setFillColor(x.getMyColor());
			r.setFilled(true);
			theWorldCanvas.add(r);
		}
	}
}
