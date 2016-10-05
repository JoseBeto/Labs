package core;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/*******************************
 * 
 * Lab2 class reads in data from a file, passes 
 * 		it to Grades class, then prints the data
 * 
 * @author Jose Bocanegra
 * 
 *******************************/

public class Lab2 extends Grades{

	public Lab2(String name, ArrayList<Integer> g) {
		super(name, g);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Main method reads in file data, from strings to integers, and inserts
	 * 		them into the Grades class
	 * 
	 * @param args
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner in = null;
		try {
		    in = new Scanner(new File("data.txt"));
		} catch (Exception FileNotFoundException) {
		    System.err.println("failed to open data.txt");
		    System.exit(1);
		}
		while (in.hasNext()) {	
		    String name = in.next();
		    ArrayList<Integer> gradeNum = new ArrayList<Integer>();
		    while (in.hasNextInt()) {
		        int grade = in.nextInt();
		        gradeNum.add(grade);
		    }
		    Grades grades = new Grades(name, gradeNum);
		    testGrades(grades);
		}
		in.close();
	}
	
	public static void testGrades(Grades grades) {
	    System.out.println(grades.toString()); 
	    System.out.printf("\tName:    %s\n", grades.getName());
	    System.out.printf("\tLength:  %d\n", grades.length());
	    System.out.printf("\tAverage: %.2f\n", grades.average());
	    System.out.printf("\tMedian:  %.1f\n", grades.median());
	    System.out.printf("\tMaximum: %d\n", grades.maximum());
	    System.out.printf("\tMininum: %d\n", grades.minimum());
	}
}
