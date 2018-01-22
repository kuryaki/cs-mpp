package lesson10.exercise_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Logger;

public class OldFileIO {
	private static final Logger LOG = Logger.getLogger(OldFileIO.class.getName());
	public final static String FILE_LOCATION = System.getProperty("user.dir") 
			+ "\\src\\lesson10\\exercise_3\\word_test.txt";
	
	void readText(String filename)  {
		File f = new File(filename);
		FileReader fr = null;
		BufferedReader reader = null;
		try {
			fr = new FileReader(f);
			reader = new BufferedReader(fr);
		
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			LOG.warning("IOException thrown when reading file: " + e.getMessage());
		} finally {  //close the resource
			try {
				if(fr != null) fr.close();
				if(reader != null) reader.close();
			} catch(IOException ex) {
				LOG.warning("IOException thrown when closing file: " + ex.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		OldFileIO oldfile = new OldFileIO();
		String filename = FILE_LOCATION;
        oldfile.readText(filename);
	}

}
