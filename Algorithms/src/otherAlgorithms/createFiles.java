/**
 * 
 */
package otherAlgorithms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MaxNass
 *
 */
public class createFiles {
	
	private static String DEBUT_FILE = "LOG_ERRORS";
	private static String EXTENSION = ".txt";

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		
		//File file = new File("");
		//String fileName = file.getName();
		String fileName = "FileIntegration";
		// DDMMYYYYHHDDMMSS
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		String fileNameLogs = DEBUT_FILE + "_" + fileName + "_" + dateFormat.format(date) + EXTENSION; 
		System.out.println(fileNameLogs);
		File fileLogs = new File(fileNameLogs);
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter out = null;
		System.out.println(fileLogs.exists());
		if(!fileLogs.exists()) {
			fileLogs.createNewFile();
		}
		System.out.println(fileLogs.getAbsolutePath());
		fw = new FileWriter(fileNameLogs, true);
		bw = new BufferedWriter(fw);
	    out = new PrintWriter(bw);
	    String errorLine = "errorline";
	    String line = "line";
	    String fullLine = line + "Block - record - record 3 - " + errorLine ;
		out.println(fullLine);
		out.println(fullLine);
	    out.close();
	}

}
