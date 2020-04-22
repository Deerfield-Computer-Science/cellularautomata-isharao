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
		world2.getCreatureList().add(new Grass(new Location(3,26), world2 ));
		world2.getCreatureList().add(new Grass( new Location(4,26), world2 ));
		world2.getCreatureList().add(new Grass( new Location(11,26), world2 ));
		world2.getCreatureList().add(new Grass( new Location(12,26), world2 ));
		world2.getCreatureList().add(new Grass(new Location(10,25), world2 ));
		world2.getCreatureList().add(new Grass( new Location(1,33), world2 ));
		world2.getCreatureList().add(new Grass( new Location(8,30), world2 ));
		world2.getCreatureList().add(new Grass( new Location(1,33), world2 ));
		world2.getCreatureList().add(new Grass( new Location(12,25), world2 ));
		world2.getCreatureList().add(new Grass( new Location(7,28), world2 ));
		world2.getCreatureList().add(new Cow( new Location(2,22), world2 ));
		world2.getCreatureList().add(new Cow( new Location(4,22), world2 ));
		world2.getCreatureList().add(new Cow( new Location(2,25), world2 ));
		world2.getCreatureList().add(new Dinosaur(new Location (3,32), world2));
		world2.getCreatureList().add(new Dinosaur(new Location (9,26), world2));
		world2.getCreatureList().add(new Dinosaur(new Location (2,24), world2));
		world2.getCreatureList().add(new Dinosaur(new Location (2,33), world2));
		world2.getCreatureList().add(new Dinosaur(new Location (8,27), world2));
		world2.getCreatureList().add(new Dinosaur(new Location (9,27), world2));
		world2.getCreatureList().add(new PoisonBerries(new Location (6,24), world2));
		world2.getCreatureList().add(new PoisonBerries(new Location (6,25), world2));
		world2.getCreatureList().add(new PoisonBerries(new Location (3,29), world2));
		world2.getCreatureList().add(new PoisonBerries(new Location (8,24), world2));
		world2.getCreatureList().add(new PoisonBerries(new Location (7,25), world2));
		world2.getCreatureList().add(new PoisonBerries(new Location (10,29), world2));
		world2.getCreatureList().add(new Mushroom(new Location (1,25), world2));
		world2.getCreatureList().add(new Mushroom(new Location (4,29), world2));
		world2.getCreatureList().add(new Mushroom(new Location (10,25), world2));
		world2.getCreatureList().add(new Mushroom(new Location (14,29), world2));
		world2.getCreatureList().add(new Mushroom(new Location (12,25), world2));
		world2.getCreatureList().add(new Mushroom(new Location (11,29), world2));
		world2.getCreatureList().add(new Finch(new Location (3,22), world2));
		world2.getCreatureList().add(new Finch(new Location (3,30), world2));
		world2.getCreatureList().add(new Finch(new Location (12,26), world2));
		world2.getCreatureList().add(new Finch(new Location (8,27), world2));
		world2.getCreatureList().add(new Finch(new Location (4,22), world2));
		world2.getCreatureList().add(new Finch(new Location (7,24), world2));
		world2.getCreatureList().add(new Human(new Location (12,21), world2));
		world2.getCreatureList().add(new Human(new Location (0,22), world2));
		world2.getCreatureList().add(new Human(new Location (7,30), world2));
		world2.getCreatureList().add(new Human(new Location (0,35), world2));
		world2.getCreatureList().add(new Human(new Location (1,33), world2));
		world2.getCreatureList().add(new Human(new Location (2,32), world2));
		world2.getCreatureList().add(new Flower(new Location (1,23), world2));
		world2.getCreatureList().add(new Flower(new Location (10,28), world2));
		world2.getCreatureList().add(new Flower(new Location (10,29), world2));
		world2.getCreatureList().add(new Flower(new Location (11,23), world2));
		world2.getCreatureList().add(new Flower(new Location (4,28), world2));
		world2.getCreatureList().add(new Flower(new Location (6,29), world2));
		world2.getCreatureList().add(new Flower(new Location (1,23), world2));
		world2.getCreatureList().add(new Flower(new Location (14,28), world2));
		world2.getCreatureList().add(new Flower(new Location (2,29), world2));
		world2.getCreatureList().add(new Flower(new Location (0,23), world2));
		world2.getCreatureList().add(new Flower(new Location (2,28), world2));
		world2.getCreatureList().add(new Flower(new Location (10,29), world2));
		world3.getCreatureList().add(new Grass(new Location(23,6), world3 ));
		world3.getCreatureList().add(new Grass( new Location(24,6), world3 ));
		world3.getCreatureList().add(new Grass( new Location(31,6), world3 ));
		world3.getCreatureList().add(new Grass( new Location(32,6), world3 ));
		world3.getCreatureList().add(new Grass(new Location(30,5), world3 ));
		world3.getCreatureList().add(new Grass( new Location(21,13), world3 ));
		world3.getCreatureList().add(new Grass( new Location(28,10), world3 ));
		world3.getCreatureList().add(new Grass( new Location(21,13), world3 ));
		world3.getCreatureList().add(new Grass( new Location(32,5), world3 ));
		world3.getCreatureList().add(new Grass( new Location(27,8), world3 ));
		world3.getCreatureList().add(new Cow( new Location(22,2), world3 ));
		world3.getCreatureList().add(new Cow( new Location(24,2), world3 ));
		world3.getCreatureList().add(new Cow( new Location(22,5), world3 ));
		world3.getCreatureList().add(new Dinosaur(new Location (23,12), world3));
		world3.getCreatureList().add(new Dinosaur(new Location (29,6), world3));
		world3.getCreatureList().add(new Dinosaur(new Location (22,4), world3));
		world3.getCreatureList().add(new Dinosaur(new Location (22,13), world3));
		world3.getCreatureList().add(new Dinosaur(new Location (28,7), world3));
		world3.getCreatureList().add(new Dinosaur(new Location (29,7), world3));
		world3.getCreatureList().add(new PoisonBerries(new Location (26,4), world3));
		world3.getCreatureList().add(new PoisonBerries(new Location (26,5), world3));
		world3.getCreatureList().add(new PoisonBerries(new Location (23,9), world3));
		world3.getCreatureList().add(new PoisonBerries(new Location (28,4), world3));
		world3.getCreatureList().add(new PoisonBerries(new Location (27,5), world3));
		world3.getCreatureList().add(new PoisonBerries(new Location (30,9), world3));
		world3.getCreatureList().add(new Mushroom(new Location (2,5), world3));
		world3.getCreatureList().add(new Mushroom(new Location (2,9), world3));
		world3.getCreatureList().add(new Mushroom(new Location (30,5), world3));
		world3.getCreatureList().add(new Mushroom(new Location (34,9), world3));
		world3.getCreatureList().add(new Mushroom(new Location (32,5), world3));
		world3.getCreatureList().add(new Mushroom(new Location (31,9), world3));
		world3.getCreatureList().add(new Finch(new Location (23,2), world3));
		world3.getCreatureList().add(new Finch(new Location (23,10), world3));
		world3.getCreatureList().add(new Finch(new Location (32,6), world3));
		world3.getCreatureList().add(new Finch(new Location (28,7), world3));
		world3.getCreatureList().add(new Finch(new Location (24,2), world3));
		world3.getCreatureList().add(new Finch(new Location (27,4), world3));
		world3.getCreatureList().add(new Human(new Location (32,1), world3));
		world3.getCreatureList().add(new Human(new Location (20,2), world3));
		world3.getCreatureList().add(new Human(new Location (27,10), world3));
		world3.getCreatureList().add(new Human(new Location (20,15), world3));
		world3.getCreatureList().add(new Human(new Location (1,13), world3));
		world3.getCreatureList().add(new Human(new Location (22,12), world3));
		world3.getCreatureList().add(new Flower(new Location (21,3), world3));
		world3.getCreatureList().add(new Flower(new Location (30,8), world3));
		world3.getCreatureList().add(new Flower(new Location (30,9), world3));
		world3.getCreatureList().add(new Flower(new Location (31,3), world3));
		world3.getCreatureList().add(new Flower(new Location (24,8), world3));
		world3.getCreatureList().add(new Flower(new Location (26,9), world3));
		world3.getCreatureList().add(new Flower(new Location (21,3), world3));
		world3.getCreatureList().add(new Flower(new Location (34,8), world3));
		world3.getCreatureList().add(new Flower(new Location (22,9), world3));
		world3.getCreatureList().add(new Flower(new Location (20,3), world3));
		world3.getCreatureList().add(new Flower(new Location (22,8), world3));
		world3.getCreatureList().add(new Flower(new Location (30,9), world3));
		world4.getCreatureList().add(new Grass(new Location(23,26), world4 ));
		world4.getCreatureList().add(new Grass( new Location(24,26), world4 ));
		world4.getCreatureList().add(new Grass( new Location(31,26), world4 ));
		world4.getCreatureList().add(new Grass( new Location(32,26), world4 ));
		world4.getCreatureList().add(new Grass(new Location(30,25), world4 ));
		world4.getCreatureList().add(new Grass( new Location(21,33), world4 ));
		world4.getCreatureList().add(new Grass( new Location(28,30), world4 ));
		world4.getCreatureList().add(new Grass( new Location(21,33), world4 ));
		world4.getCreatureList().add(new Grass( new Location(32,25), world4 ));
		world4.getCreatureList().add(new Grass( new Location(27,28), world4 ));
		world4.getCreatureList().add(new Cow( new Location(22,22), world4 ));
		world4.getCreatureList().add(new Cow( new Location(24,22), world4 ));
		world4.getCreatureList().add(new Cow( new Location(22,25), world4 ));
		world4.getCreatureList().add(new Dinosaur(new Location (23,32), world4));
		world4.getCreatureList().add(new Dinosaur(new Location (29,26), world4));
		world4.getCreatureList().add(new Dinosaur(new Location (22,24), world4));
		world4.getCreatureList().add(new Dinosaur(new Location (22,33), world4));
		world4.getCreatureList().add(new Dinosaur(new Location (28,27), world4));
		world4.getCreatureList().add(new Dinosaur(new Location (29,27), world4));
		world4.getCreatureList().add(new PoisonBerries(new Location (26,24), world4));
		world4.getCreatureList().add(new PoisonBerries(new Location (26,25), world4));
		world4.getCreatureList().add(new PoisonBerries(new Location (23,29), world4));
		world4.getCreatureList().add(new PoisonBerries(new Location (28,24), world4));
		world4.getCreatureList().add(new PoisonBerries(new Location (27,25), world4));
		world4.getCreatureList().add(new PoisonBerries(new Location (30,29), world4));
		world4.getCreatureList().add(new Mushroom(new Location (21,25), world4));
		world4.getCreatureList().add(new Mushroom(new Location (24,29), world4));
		world4.getCreatureList().add(new Mushroom(new Location (30,25), world4));
		world4.getCreatureList().add(new Mushroom(new Location (34,29), world4));
		world4.getCreatureList().add(new Mushroom(new Location (32,25), world4));
		world4.getCreatureList().add(new Mushroom(new Location (31,29), world4));
		world4.getCreatureList().add(new Finch(new Location (23,22), world4));
		world4.getCreatureList().add(new Finch(new Location (23,30), world4));
		world4.getCreatureList().add(new Finch(new Location (32,26), world4));
		world4.getCreatureList().add(new Finch(new Location (28,27), world4));
		world4.getCreatureList().add(new Finch(new Location (24,22), world4));
		world4.getCreatureList().add(new Finch(new Location (27,24), world4));
		world4.getCreatureList().add(new Human(new Location (32,21), world4));
		world4.getCreatureList().add(new Human(new Location (20,22), world4));
		world4.getCreatureList().add(new Human(new Location (27,30), world4));
		world4.getCreatureList().add(new Human(new Location (20,35), world4));
		world4.getCreatureList().add(new Human(new Location (21,33), world4));
		world4.getCreatureList().add(new Human(new Location (22,32), world4));
		world4.getCreatureList().add(new Flower(new Location (21,23), world4));
		world4.getCreatureList().add(new Flower(new Location (30,28), world4));
		world4.getCreatureList().add(new Flower(new Location (30,29), world4));
		world4.getCreatureList().add(new Flower(new Location (31,23), world4));
		world4.getCreatureList().add(new Flower(new Location (24,28), world4));
		world4.getCreatureList().add(new Flower(new Location (26,29), world4));
		world4.getCreatureList().add(new Flower(new Location (21,23), world4));
		world4.getCreatureList().add(new Flower(new Location (34,28), world4));
		world4.getCreatureList().add(new Flower(new Location (22,29), world4));
		world4.getCreatureList().add(new Flower(new Location (20,23), world4));
		world4.getCreatureList().add(new Flower(new Location (22,28), world4));
		world4.getCreatureList().add(new Flower(new Location (30,29), world4));
		

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
				r.setColor(Color.RED);
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
				r.setColor(Color.CYAN);
				r.setFillColor(Color.WHITE);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
		}
		for(int row = 20 ; row<world4.getWidth()+20; row++) {
			for(int col=20; col<world4.getHeight()+20; col++){
				GRect r = new GRect(row*20,col*20,20,20);
				r.setColor(Color.PINK);
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
