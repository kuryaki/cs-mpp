package lesson5.lecture.factorymethods;

import java.net.*;
import java.io.*;

/**
 * This program explicitly retrieves a URLConnection object 
 * and gets an input stream from the connection. Note that a URLConnection instance 
 * does not establish the actual network connection on creation.
 * The connection is opened implicitly by calling getInputStream. 
 * Then, it creates a BufferedReader on the 
 * input stream and reads from it. Reading from a URLConnection 
 * (as is done here) instead of reading directly 
 * from a URL has the advantage that you can use the 
 * URLConnection object for other tasks 
 * (like writing to the URL) at the same time.
 */
public class ConnectExample {
	public static void main(String[] args) throws Exception {
		URL oracle = new URL("http://www.oracle.com/");
		URLConnection urlConn = oracle.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
				urlConn.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
	}
}
