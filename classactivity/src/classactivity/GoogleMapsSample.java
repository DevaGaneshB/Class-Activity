package classactivity;

import java.io.BufferedReader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
public class GoogleMapsSample {
	JFrame test = new JFrame("Google Maps");
	GoogleMapsSample() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Please enter a location:");
	    String postcode=reader.readLine();
	 String latLongs[] = getLatLongPositions(postcode);
	    System.out.println("Latitude: "+latLongs[0]+" and Longitude: "+latLongs[1]);
	    
	    try {
	    	String latitude = latLongs[0];
	    	String longitude = latLongs[1];
	    	String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
	    	+ latitude
	    	+ ","
	    	+ longitude
	    	+ "&zoom=40&size=612x612&scale=2&maptype=roadmap";
	    	String destinationFile = "image.jpg";
	    	// read the map image from Google
	    	// then save it to a local file: image.jpg
	    	//
	    	URL url = new URL(imageUrl);
	    	InputStream is = url.openStream();
	    	OutputStream os = new FileOutputStream(destinationFile);
	    	byte[] b = new byte[2048];
	    	int length;
	    	while ((length = is.read(b)) != -1) {
	    	os.write(b, 0, length);
	    	}
	    	is.close();
	    	os.close();
	    	} catch (IOException e) {
	    	e.printStackTrace();
	    	System.exit(1);
	    	}
	    	// create a GUI component that loads the image: image.jpg
	    	//
	    	ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
	    	.getImage().getScaledInstance(630, 600,
	    	java.awt.Image.SCALE_SMOOTH));
	    	test.add(new JLabel(imageIcon));
	    	// show the GUI window
	    	test.setVisible(true);
	    	test.pack();
	    	}

	

	  public static String[] getLatLongPositions(String address) throws Exception
	  {
	    int responseCode = 0;
	    String api = "http://maps.googleapis.com/maps/api/geocode/xml?address=" + URLEncoder.encode(address, "UTF-8") + "&sensor=true";
	    URL url = new URL(api);
	    HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
	    httpConnection.connect();
	    responseCode = httpConnection.getResponseCode();
	    if(responseCode == 200)
	    {
	      DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();;
	      Document document = builder.parse(httpConnection.getInputStream());
	      XPathFactory xPathfactory = XPathFactory.newInstance();
	      XPath xpath = xPathfactory.newXPath();
	      XPathExpression expr = xpath.compile("/GeocodeResponse/status");
	      String status = (String)expr.evaluate(document, XPathConstants.STRING);
	      if(status.equals("OK"))
	      {
	         expr = xpath.compile("//geometry/location/lat");
	         String latitude = (String)expr.evaluate(document, XPathConstants.STRING);
	         expr = xpath.compile("//geometry/location/lng");
	         String longitude = (String)expr.evaluate(document, XPathConstants.STRING);
	         return new String[] {latitude, longitude};
	      }
	      else
	      {
	         throw new Exception("Error from the API - response status: "+status);
	      }
	    }
	    return null;
	  }
	public static void main(String[] args) throws Exception {
      
		new GoogleMapsSample();

}
}
