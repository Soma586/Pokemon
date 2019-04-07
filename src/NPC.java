import java.awt.Graphics;

public class NPC extends Sprite{
	
	static String[] poses = { "up", "dn", "lt", "rt"};
	
	/*
	boolean faceup = false;
	boolean facedown = false;
	boolean faceleft = false;
	boolean faceright = false;
	*/
	
	int w = 80;
	int h = 100;
	
	
	Rect r1 = new Rect(x,y -150, 80,150);
	Rect r2 = new Rect(x -150,y, 150,80);
	Rect r3 = new Rect(x + 80,y, 150,80);
	Rect r4 = new Rect(x,y -150, 80,150);
	
	public NPC(int x, int y) {
		super(x, y, "p", poses, 4, 10);
		//
	}
	
	
	//this checks the npc line of site
	public void site(Graphics g) {
		
		
		if(faceup) {
		g.drawRect(x , y -150, 80, 150);
		}
		
	}
	
	//draws a box if the npc is facing left
	public void leftsite(Graphics g) {
		
		
		if(faceleft) {
		//g.drawRect( x - 150, y, 150, 80);
			r1.draw(g);
		}
	}
	
	//draws a box if the npc is face right
	public void rightsite(Graphics g) {
		
		if(faceright) {
		g.drawRect( x + 80 , y, 150, 80);
		}
		
	}
	
	
	//draws a box if the npc is facing down
	public void downsite(Graphics g) {
		
	}
	
	public boolean caught(Player p) {
		
		//if(p.x >= x && p.y)
		
		
		return false;
	}


	@Override
	public void hitbox() {
		// TODO Auto-generated method stub
		
	}
	/*
	public Rectangle getBounds() {
		
	}
	*/
	
}
