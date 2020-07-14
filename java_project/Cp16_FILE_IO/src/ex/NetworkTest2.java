package ex;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkTest2 {

	public static void main(String[] args ) {
		URL url = null;
		
		String address = "https://www.google.com/search?q=java&oq=java&aqs=chrome..69i57j69i59l3j35i39j0l3.3693j0j8&sourceid=chrome&ie=UTF-8";
		
		try {
		url = new URL(address);
		try {
			URLConnection conn = url.openConnection();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
