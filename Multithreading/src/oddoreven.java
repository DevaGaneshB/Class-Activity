
import java.io.*;  

	 class Table {
			
		 synchronized void printTable(int n,String File) throws FileNotFoundException{//synchronized method  
		
			 
		   String s="";
		   PrintWriter fout=new PrintWriter(File);        
		     
		   for(int i=n;i<=10;i=i+2){
			   s=s+"\t"+i;
		   }   
		   fout.write(s);  
		   fout.close();
		   System.out.println("success...");
		     try{  
		      Thread.sleep(1400);  
	     }catch(Exception e){System.out.println(e);}  
		     
		  
		 }  
		}  
		  
		class MyThread1 extends Thread{  
		Table t;  
		MyThread1(Table t){  
		this.t=t;  
		}  
		public void run(){
		try {
			String File="Even.txt";
			
			t.printTable(0,File);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}  
		  
		}  
		class MyThread2 extends Thread{  
	Table t;  
		MyThread2(Table t){  
		this.t=t;  
		}  
		public void run(){  
		try {
			String fil="‪Odd.txt";
			t.printTable(1,fil);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		}  
		}  
		  
		public class oddoreven{ 
	public static void main(String args[]){  
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}  
  


}
