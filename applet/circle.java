package applet;


import java.awt.Graphics;
import java.applet.Applet;    
public class circle extends Applet
{
  public void paint (Graphics g)
  {			                 // using drawRoundRect()
    g.drawRoundRect(40, 160, 90, 90, 200, 200);
			                 // using drawOval()
    g.drawArc(150, 160, 90, 90,180,180);
    g.drawLine(150,205,240,205);
			                // using drawArc()

    g.drawArc(270, 160, 90, 90, 0, 180);

    g.drawLine(270,205,360,205);
  }
}
