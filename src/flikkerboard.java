


import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
class Table1 {
	
	 synchronized void print(int n){//synchronized method  
		  if(n!=0) {
				for(int i=79;i>=0;i--)
				{
					String s="Dunkirk ";
				JFrame frame = new JFrame();
				  ImageIcon icon = new ImageIcon(s+Integer.toString(i)+".png");
				  JLabel label = new JLabel(icon);
				  frame.add(label);
				  frame.pack();
				  frame.setSize(1920, 1080);
				 	

				  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				  frame.setVisible(true); 
				  
				}
				
				  try
			        {
			            Thread.sleep(0);
			        }
			        catch (Exception e)
			        {
			            System.out.println("Thread  interrupted.");
			        }
				}
		  else {
			  for(int i=0;i<=79;i++)
				{
					String s="Dunkirk ";
				JFrame frame = new JFrame();
				  ImageIcon icon = new ImageIcon(s+Integer.toString(i)+".png");
				  JLabel label = new JLabel(icon);
				  frame.add(label);
				  frame.pack();
				  frame.setSize(1920, 1080);
				 	

				  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				  frame.setVisible(true);	
				 	
				}
				  try
			        {
			            Thread.sleep(0);
			        }
			        catch (Exception e)
			        {
			            System.out.println("Thread  interrupted.");
			        }
					
				  
				 

		  }
	 }  
	 }
class img11 extends Thread
{ 
	Table1 t;  
	img11(Table1 t){ 
	this.t=t; 
	}
		

		@Override
		public void run() {
			// TODO Auto-generated method stub
			t.print(0);
			
		}
		
	
}

class img21 extends Thread
{
	
	Table1 t;  
	img21(Table1 t){ 
	this.t=t; 
	}	

		@Override
		synchronized public void run() {
			// TODO Auto-generated method stub
			t.print(1);
			
		}
		
	
}
public class flikkerboard
{
	public static void main(String args[])
	{
		Table1 obj = new Table1();
		img11 a = new img11(obj);
		img21 b = new img21(obj);

	
		a.start();
		b.start();
		
	}

}



