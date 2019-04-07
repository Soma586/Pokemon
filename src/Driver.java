import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Driver extends Applet implements Runnable, KeyListener
{
//	Image image = Toolkit.getDefaultToolkit().getImage("g_rt_0.gif");
	
	
//	Animation anim = new Animation("g_dn", 5, 10);
	
	/*
	Line line1 = new Line(100, 100, 10, 300);
	Line line2 = new Line(10, 300, 100, 500);
	Line line3 = new Line(100, 500, 700, 600);
	Line line4 = new Line(700, 600, 750, 150);
	Line line5 = new Line(750, 150, 200, 100);
	
	Circle    c  = new Circle(400, 100, 20, 90);
	
	BadCircle bc = new BadCircle(300, 200, 20, 45);
	*/
	
	Image offscreeng;
	Graphics offscreen_g;
	
	
	Player p = new Player(100,100);
	
	NPC npc = new NPC(500, 500);
	NPC npc2 = new NPC(100, 100);
	//Rect rr1 = new Rect(500, 200, 30, 30);
	BadRect evil = new BadRect(300,300,50, 50);
	//Soldier soldier = new Soldier(100, 100);
	//BattleLord bl = new BattleLord(130, 80);
	boolean up_pressed = false;
	boolean dn_pressed = false;
	boolean lt_pressed = false;
	boolean rt_pressed = false;
	boolean  A_pressed = false;
	boolean  S_pressed = false;
	boolean  W_pressed = false;
	
	
	Thread t;
	//Rect r1 = new Rect(950, 100, 100, 500);
	
	/*
	Tank tank1 = new Tank(100, 100, 0);
	Tank tank2 = new Tank(500, 300, 0);
	
	Rect r1 = new Rect(50, 100, 10, 50);
	Rect r2 = new Rect(900, 400, 10, 50);
	
	Rect ball = new Rect(100, 100, 10, 10);
	*/
	

	
	public void init()
	{
		
		offscreeng = this.createImage(1000,600);
		offscreen_g = offscreeng.getGraphics();
		
		this.setSize(1000, 600);
		requestFocus();
		
		addKeyListener(this);
		
		
		
		t = new Thread(this);
		
		t.start();
		
	
		
	}
	
	
	public void update(Graphics g) {
		
		offscreen_g.clearRect(0, 0, 1000, 600);
		paint(offscreen_g);
		
		g.drawImage(offscreeng, 0,0, 1000, 600, null);
		
		
		
	}
	
	public void run()
	{
		//ball.setVelocity(4, 15);
		while(true)
		{
			
         //if(bc.notTooCloseTo(c))		bc.chases(c);
			
			
			
			
			if(up_pressed)  {
					npc2.moveUp(2); 
					
			}
			if(dn_pressed)   npc2.moveDown(2);
			if(lt_pressed)   npc2.moveLeft(2);
			if(rt_pressed)   npc2.moveRight(2);
			
			//if(p.x >500 && p.y <300) {
				//rr1.chases();
				//evil.moveDownBy(10);
			//}
			
			//r1.draw(g);
			
			
			
         
         
         /*
			
			if(up_pressed)   c.moveForward(3);
			if(dn_pressed)   soldier.moveDown(1);
			if(lt_pressed)   c.turnLeft(3);
			if(rt_pressed)   c.turnRight(3);

			if(up_pressed)   soldier.moveUp(1);
			if(dn_pressed)   soldier.moveDown(1);
			if(lt_pressed)   soldier.moveLeft(1);
			if(rt_pressed)   soldier.moveRight(1);
			
			if(up_pressed)   bl.moveUp(1);
			if(dn_pressed)   bl.moveDown(1);
			if(lt_pressed)   bl.moveLeft(1);
			if(rt_pressed)   bl.moveRight(1);
			*/
			
			
/*			if(up_pressed)   r1.moveUpBy(4);
			if(dn_pressed)   r1.moveDownBy(4);
						
			if(W_pressed)    r2.moveUpBy(4);
			if(S_pressed)    r2.moveDownBy(4);
			
			ball.moveForward();
			
			
			if(ball.overlaps(r1))  ball.bounceX();

			if(ball.overlaps(r2))  ball.bounceX();
*/				
				

/*			
			if(lt_pressed)   r1.moveBy(-4, 0);
			if(rt_pressed)   r1.moveBy( 4, 0);

			
			if(up_pressed)   tank1.moveForwardBy(4);
			if(dn_pressed)   tank1.moveBy(0, 2);
			
			if(A_pressed)    tank1.rotateGunBy(-6);
			if(S_pressed)    tank1.rotateGunBy(6);
			
			if(lt_pressed)   tank1.rotateBy(-2);
			if(rt_pressed)   tank1.rotateBy(2);
*/			
			repaint();
			
			try
			{
			   t.sleep(16);
			}
			catch(Exception x) {};
		}
	}
	
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_UP)     up_pressed = true;
		if (e.getKeyCode() == KeyEvent.VK_DOWN)   dn_pressed = true;
		if (e.getKeyCode() == KeyEvent.VK_LEFT)   lt_pressed = true;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)  rt_pressed = true;
		if (e.getKeyCode() == KeyEvent.VK_A)      A_pressed  = true;
		if (e.getKeyCode() == KeyEvent.VK_S)      S_pressed  = true;
		if (e.getKeyCode() == KeyEvent.VK_W)      W_pressed  = true;
		
	}
	
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_UP)     up_pressed = false;
		if (e.getKeyCode() == KeyEvent.VK_DOWN)   dn_pressed = false;
		if (e.getKeyCode() == KeyEvent.VK_LEFT)   lt_pressed = false;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)  rt_pressed = false;
		if (e.getKeyCode() == KeyEvent.VK_A)      A_pressed  = false;
		if (e.getKeyCode() == KeyEvent.VK_S)      S_pressed  = false;
		if (e.getKeyCode() == KeyEvent.VK_W)      W_pressed  = false;
		
	}

	public void keyTyped(KeyEvent e)
	{
		
	}
	
	public void paint(Graphics g)
	{
		
		/*line1.draw(g);
		line2.draw(g);
		line3.draw(g);
		line4.draw(g);
		line5.draw(g);
		c.draw(g);
		bc.draw(g);
		*/
		
		if(npc.r1.overlapss(npc2)) {
			//System.out.println("i should stop the player!!");
			npc.moveUp(2);
		}
		
		
		//p.draw(g);
		npc2.draw(g);
		npc.draw(g);
		//npc2.draw(g);
		//npc.rightsite(g);
		//npc.leftsite(g);
		//if(up_pressed) {
			//npc.site(g);
		//}
		
		//if(lt_pressed) npc.leftsite(g);
		//if(rt_pressed) npc.rightsite(g);
		//npc.site(g);
		//evil.draw(g);
		
		/*
		if(A_pressed) {
		rr1.draw(g);
		}
		*/
		
		
		
		
		
		//soldier.draw(g);
		
		///bl.draw(g);
		
		
		
		//g.drawImage(anim.getStillImage(), 100, 100, null);
		//g.drawImage(anim.getCurrentImage(), 100, 100, null);
		
		
		
		
		
		//g.drawImage(image, 100, 100, null);
	//	tank1.draw(g);
	//	tank2.draw(g);
/*		
		r1.draw(g);
		r2.draw(g);
		
		ball.draw(g);
		
		if (r1.overlaps(r2))   g.drawString("overlaps", 10, 20);
		
		else                   g.drawString("", 10, 20);
*/		
	}
	
}