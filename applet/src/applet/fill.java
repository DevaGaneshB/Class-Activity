package applet;


/*
	Set Graphics Color Example 
	This java example shows how to set graphics color using Java AWT Color class.
*/
 
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
 
/*
<applet code="SetGraphicsColorExample" width=200 height=100>
</applet>
*/
 
 
public class fill extends Applet{
 
	public void paint(Graphics g) {
		/*
		 * Graphic objects like lines and rectangles uses current
		 * foreground color.
		 * 
		 * To change the current graphic color use
		 * void setColor(Color c) method of Graphics Class.
		 */
		
		//this will create light blue color
		Color customColor = new Color(128,0,128);
		Color customColor1 = new Color(0,0,0);
		
		g.setColor(customColor1);
		g.drawLine(10,10,30,30);
		
		g.setColor(customColor);
		g.fillRect(40,40,40,40);
		
		g.setColor(customColor1);
		g.fillRect(80,80,40,40);
		
		g.draw3DRect(81,81,40,40,true);
		
	}
}