	import java.awt.*;  
	import java.applet.*; 
public class Exp201 extends Applet  {
 

	  
	  Image picture;  
	  
	  public void init() {  
	    picture =getImage(getDocumentBase(),"Download.jpg");  
	  }  
	    
	  public void paint(Graphics g) {  
	    for(int i=0;i<500;i++){  
	      g.drawImage(picture, i,i, this);  
	  
	      try{Thread.sleep(100);}catch(Exception e){}  
	    }  
	  
	}  
}
