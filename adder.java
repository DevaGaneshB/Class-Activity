// A Java program to demonstrate random number generation
// using java.util.Random;
import java.util.Random;
import javax.swing.*;  
import java.io.*; 
import java.awt.event.*;  
public class adder{

	 String s1="";
	 String s2="";
	int[] sum= new int[3];
	adder(){
   	    
    	for(int i=0;i<3;i++)
    	{
        // create instance of Random class
        Random rand = new Random();
 
        // Generate random integers in range 0 to 99
        int rand_int1 = rand.nextInt(100);
        int rand_int2 = rand.nextInt(100);
        sum[i]=rand_int1+rand_int2;
        s1=s1+Integer.toString(rand_int1)+"\t"+Integer.toString(rand_int2)+"\n";
        s2=s2+Integer.toString(rand_int1)+"\t"+Integer.toString(rand_int2)+"\t"+Integer.toString(sum[i])+"\n";
        // Print random integers
    	}
	}
    public void print(String n){
		try {

        	PrintWriter fout;	
		fout = new PrintWriter("Data.xls");
		fout.write("A"+"\t"+"B"+"\n");
    	fout.write(n);
    	fout.close();  
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
    	
    	
    	}
    public void print1(String n1) {
		try {

        	PrintWriter fout;
			fout = new PrintWriter("Data.xls");
			fout.write("A"+"\t"+"B"+"\t"+"SUM"+"\n");
        	fout.write(n1);
        	
        	fout.close();  
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
    	
    	
    	}
    
    

    public static void main(String args[])
    {
    	adder a=new adder();
    	 JFrame f=new JFrame("Button Example");  
    	    JButton b=new JButton("Generate");  
    	    JButton b1=new JButton("Sum");
    	    b.setBounds(50,100,95,30);  
    	    b1.setBounds(50,200,95,30);  
    	    
    	    f.add(b); 
    	    f.add(b1); 
    	    f.setSize(400,400);  
    	    f.setLayout(null);  
    	    f.setVisible(true);   
            
        b.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	           
        	        a.print(a.s1);
        
        	}
	    });  
        
    	
        b1.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	           
        	      a.print(a.s2);  
       
        	}
	    });  

       }
    
}

