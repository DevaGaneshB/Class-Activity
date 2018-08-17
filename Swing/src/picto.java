
import java.awt.*;  
import javax.swing.JFrame;  
  
@SuppressWarnings("serial")
public class picto extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("imgeg.jpg");  
        g.drawImage(i, 120,100,this);  
          
    }  
        public static void main(String[] args) {  
        	picto m=new picto();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
  
}  

