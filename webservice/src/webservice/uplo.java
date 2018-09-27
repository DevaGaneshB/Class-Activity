package webservice;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class uplo {

	uplo(int n,int f){
		Fillo filloc= new Fillo();
		Connection connection1;
		try {
			connection1 = filloc.getConnection("fact.xlsx");
			String str1Queryc ="INSERT INTO Sheet1(Number,Factorial)VALUES('"+n+"','"+f+"')";
			connection1.executeUpdate(str1Queryc);		
			connection1.close();
		} catch (FilloException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
