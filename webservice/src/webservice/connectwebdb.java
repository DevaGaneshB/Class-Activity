package webservice;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class connectwebdb {

	connectwebdb(int num,int fact){
	System.out.println(num+"\n");
	System.out.println(fact);
	
	Fillo filloc= new Fillo();
	Connection connection1;
	try {
		connection1 = filloc.getConnection("fact.xlsx");
		String str1Queryc ="INSERT INTO Sheet1(Number,Factorial)VALUES('"+num+"','"+fact+"')";
		connection1.executeUpdate(str1Queryc);		
		connection1.close();
	} catch (FilloException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
	}
	public static void main(String args[]) {
		new connectwebdb(2,2);
	}
}
