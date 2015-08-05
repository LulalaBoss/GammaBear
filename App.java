/**
 
 **/
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.io.IOException;
 
 public class App extends GameCore
 {
    private GameView gameView;
	private GameState gameState;
	private int newsFlash = 100;
  
   public App()
   {
	   gameState = new GameState("My First Restaurant", 1000);
	   gameView = new GameView(gameState);
   }
   
   public void init(){
    super.init();		
  }
   
   public static void main(String [ ] args)
   {
	 new App().run();
   }
   
   public void run()
   {
	   super.run();
   }
   
   public void draw(Graphics2D g)
   {
	   // Top reporting panel
	   g.drawString(gameView.storeName(),50,150);  
	   g.drawString("Total cash: $" + gameView.storeCash(),50,200);
	   g.drawString("Customers waiting: ",50,250);
	   g.drawString("Customers dining: ",50,350);
	   
	   // Current status report
	   if(newsFlash>0)
	   {
		   g.drawString("NEWS FLASH!!! " + newsFlash,50,400);
		   newsFlash=newsFlash-10;
	   }
	   else
	   {
		   g.drawString("DONE!!",50,450);
	   }
   } 
    
}