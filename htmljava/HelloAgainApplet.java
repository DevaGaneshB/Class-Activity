//Type
//Listing 8.1. The Hello Again applet.
  import java.awt.Graphics;

  import java.awt.Font;

  import java.awt.Color;


  public class HelloAgainApplet extends java.applet.Applet {


     Font f = new Font("TimesRoman",Font.BOLD,36);


    public void paint(Graphics g) {

        g.setFont(f);

       g.setColor(Color.red);

      g.drawString("Hello again!", 5, 50);

     }

 }