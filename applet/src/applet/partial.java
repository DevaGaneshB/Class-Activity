package applet;
import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
public class partial  extends java.applet.Applet{
	

	    public void paint(Graphics g) {
	        g.drawRect(20,20,60,60);
	        g.setColor(Color.blue);
	        g.fillRect(120,20,60,30);
	        g.setColor(Color.red);
	        g.fillRect(120,30,60,60);
	       
	        
	    }

}

