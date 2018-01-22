package lesson10.exercise_3_soln;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * Improvements to OldFileIO:
 * 
 * 1. Uses try-with-resources to manage closing resources
 * 2. Uses lines() method of BufferedReader to read lines of the file
 * 3. Locates file relative to classpath rather than file system;
 * should be able to locate file when code is moved to production
 *
 */
public class NewFileIO {
	private static final Logger LOG = Logger.getLogger(NewFileIO.class.getName());
	private static final String FILENAME ="word_test.txt";
	
	void readText(String filename)  {
		InputStream fileAsInputStream = getFileAsInputStream(filename);
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(fileAsInputStream))){
			//new method in Readers, Java 8
			reader.lines().forEach(System.out::println);
		} catch(IOException e) {
			LOG.warning("IOException occurred when reading file " + filename + ": " + e.getMessage());
			List<Throwable> suppressed = Arrays.asList(e.getSuppressed());	
			suppressed.forEach(except -> LOG.warning("Suppressed message: " 
			                                         + except.getMessage()));
		}

	}
	
	private InputStream getFileAsInputStream(String filename) {
		
		InputStream is = null;
		String pkge = asPath(getClass().getPackage().getName());
		try {
			URL fileAsUrl = this.getClass().getClassLoader().getResource(pkge + "/" + filename);
			if(fileAsUrl == null) throw new IOException();
			is = fileAsUrl.openStream();
		} catch(IOException e) {
			String msg = "Unable to read file as an InputStream";
			LOG.warning(msg);
			throw new RuntimeException(msg);
		}
		return is;
	}
	private String asPath(String packageName) {
		//replace dots with '/'
		return packageName.replace('.','/');
	}
	
	public static void main(String[] args) {
		NewFileIO newfile = new NewFileIO();
		newfile.readText(FILENAME);
		
	}

}
