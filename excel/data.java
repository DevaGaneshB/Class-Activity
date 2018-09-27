package excel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class data {
	data(){
		 JFrame frame = new JFrame("SignUp Form");
		 
		 
		  JLabel l2 = new JLabel("name");
		  JLabel l3 = new JLabel("Password");
		  JLabel l4 = new JLabel("Confirm Password");
		  
		  JTextField tf1 = new JTextField();
		  JPasswordField p1 = new JPasswordField();
		  JPasswordField p2 = new JPasswordField();
	      JButton sign =new JButton("SignUp");	 
		  l2.setBounds(80, 70, 200, 30);
		  l3.setBounds(80, 110, 200, 30);
		  l4.setBounds(80,150,200,30);
		  tf1.setBounds(300, 70, 200, 30);
		  p1.setBounds(300, 110, 200, 30);
		  p2.setBounds(300,150,200,30);
		  sign.setBounds(450, 200, 100, 30);
		  
		  
		  frame.add(p2);
		  frame.add(l2);
		  frame.add(tf1);
		  frame.add(l3);
		  frame.add(p1);
		  frame.add(l4);
		  frame.add(sign);
		 
		  frame.setSize(800, 400);
		  frame.setLayout(null);
		  frame.setVisible(true);
		  

		  sign.addActionListener(new ActionListener(){  
			  public void actionPerformed(ActionEvent e){  
			  if(p1.getText().equals(p2.getText())) {
				  Fillo filloc= new Fillo();
					Connection connection1;
					try {
						connection1 = filloc.getConnection("name.xlsx");
						String str1Queryc ="INSERT INTO Sheet1(name,Password)VALUES('"+tf1.getText()+"','"+p1.getText()+"')";
						connection1.executeUpdate(str1Queryc);		
						connection1.close();
					} catch (FilloException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	          		JOptionPane.showMessageDialog(null,"Account created successfully");			
	          		frame.dispose();		  
	          		
			  }
			  else {

          		JOptionPane.showMessageDialog(null,"Password does'nt match");
			  }
			  }  
	      }); 
		
	}
public static void main(String args[]) {
	new data();
}
}
