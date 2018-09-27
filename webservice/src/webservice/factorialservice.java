package webservice;

public class factorialservice {
	
	public int fact(int numm) {
        int val=numm;   
		int fact=numm;	
		while(numm>1) {
			fact=fact*(numm-1);
		    numm--;
		}
		new  connectwebdb(val,fact);
		return fact;
	}


}
