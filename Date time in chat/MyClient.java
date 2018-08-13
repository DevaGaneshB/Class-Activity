import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 
import java.net.*;  
import java.io.*; 
class MyClient{  
public static void main(String args[])throws Exception{  
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	   LocalDateTime now = LocalDateTime.now();
Socket s=new Socket("localhost",3333);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
String s11="User1 \t Date&Time \t User2 \t Date&Time \n";  
String str="",str2="";
String dat1="",dat2="";
while(!str.equals("stop")){  
str=br.readLine();  
dat1=dtf.format(now);
dout.writeUTF(str);  
dout.flush();  
str2=din.readUTF();  
dat2=dtf.format(now);
System.out.println("Server says: "+str2);  
s11=s11+"\n"+str+"\t"+dat1+"\t"+str2+"\t"+dat2;
}  
dout.close();  
s.close();
try {
PrintWriter fout=new PrintWriter("‪ChatHistory.xls"); 
fout.write(s11);
fout.close();  
}catch(FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}}