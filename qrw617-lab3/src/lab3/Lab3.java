package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***********************************************
 * 
 * Lab3 class reads in data from a file by
 * 	line and passes the string to Date class.
 * 	It then prints the date object and then
 * 	passes date and the previous date (oldDate)
 *  to DateRange class. Now it determines if 
 *  daterange and date objects are valid to 
 *  print, then prints it.
 * 
 * @author Jose Bocanegra
 * 
 ***********************************************/

public class Lab3 {
	
	/*
	 * Main method reads in file data, stores them to string,
	 * 	passes to Date and DateRange class where they are 
	 * 	organized appropriately, then Main method tests to see
	 * 	if the data is correct to output, outputting if it passes
	 * 	the tests.
	 * 
	 * @param args
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
