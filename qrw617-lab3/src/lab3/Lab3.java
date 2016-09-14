package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/******************************
 * 
 * @author Jose Bocanegra
 * 
 ******************************/

public class Lab3 {
	
	/*
	 * Main method comment
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		try {
		    in = new Scanner(new File("dates.txt"));
		} catch (FileNotFoundException exception) {
		    System.err.println("failed to open dates.txt");
		    System.exit(1);
		}
		Date oldDate = new Date();
		while (in.hasNextLine()) {
		    String line = in.nextLine();
			Date date = new Date(line);
			System.out.println(date);
		    // need more code for DateRange objects
		    DateRange daterange = new DateRange(date, oldDate);
		    if((daterange.getI() == 1) && (oldDate.getDate() != null) && (date.getDate() 
		    		!= null) && (oldDate.getDate() != "") && (date.getDate() != ""))
		    	System.out.println(daterange);
		    oldDate = date;
		}
	}

}
