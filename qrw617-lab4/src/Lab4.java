import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import length.*;

/*********************************************
 * The Lab4 class will store data from data.txt into
 * 	the Length class, then print out the values,
 * 	print the min and max value, then print the sum
 * 	calculated two different ways, one adding from the
 * 	first to the last value and the other adding from 
 * 	the last to the first vlue.
 * 
 * @author Jose Bocanegra
 *********************************************/

public class Lab4 {

	/**
	 * Main method will read in the data from data.txt, store them in
	 * 	temp values named value and unit, then use unit to determine which
	 * 	class value will be sent to, which is then stored into length. After
	 * 	it is stored in length, we will add it to an ArrayList.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner in = null;
		try {
		    in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
		    throw new RuntimeException("failed to open data.txt");
		}
		ArrayList<Length> values = new ArrayList<Length>();
		while (in.hasNextDouble()) {
		    double value = in.nextDouble();
		    String unit = in.next();
		    Length length = null;
		    if(unit.equalsIgnoreCase("foot") || unit.equalsIgnoreCase("feet"))
		    	length = new Foot(value);
		    else if(unit.equalsIgnoreCase("inch") || unit.equalsIgnoreCase("inches"))
		    	length = new Inch(value);
		    else if(unit.equalsIgnoreCase("meter") || unit.equalsIgnoreCase("meters"))
		    	length = new Meter(value);
		    else if(unit.equalsIgnoreCase("yard") || unit.equalsIgnoreCase("yards"))
		    	length = new Yard(value);
		    values.add(length);
		    System.out.println(length);
		}
		findMinAndMax(values);
		addFirstToLast(values);
		addLastToFirst(values);
		in.close();
	}
	
	/**
	 * Adds the values in ArrayList v together from First to Last
	 * 	then prints the result.
	 * 
	 * @param v
	 */
	
	public static void addFirstToLast(ArrayList<Length> v) {
		Foot foot = new Foot(0);
		Inch inch = new Inch(0);
		Meter meter = new Meter(0);
		Yard yard = new Yard(0);
		for(int i = 0; i < v.size(); i++) {
			foot.add(v.get(i));
			inch.add(v.get(i));
			meter.add(v.get(i));
			yard.add(v.get(i));
		}
		System.out.println("\nSum of Lengths Adding from First to Last");
		System.out.println(meter);
		System.out.println(inch);
		System.out.println(foot);
		System.out.println(yard);
	}
	
	/**
	 * Adds the values in ArrayList v together from Last to First
	 * 	then prints the result.
	 * 
	 * @param v
	 */
	
	public static void addLastToFirst(ArrayList<Length> v) {
		Foot foot = new Foot(0);
		Inch inch = new Inch(0);
		Meter meter = new Meter(0);
		Yard yard = new Yard(0);
		for(int i = v.size() - 1; i >= 0; i--) {
			foot.add(v.get(i));
			inch.add(v.get(i));
			meter.add(v.get(i));
			yard.add(v.get(i));
		}
		System.out.println("\nSum of Lengths Adding from Last to First");
		System.out.println(meter);
		System.out.println(inch);
		System.out.println(foot);
		System.out.println(yard);
	}
	
	/**
	 * Will find the Min and Max value in the ArrayList v
	 * 	then print the result.
	 * 
	 * @param v
	 */
	
	public static void findMinAndMax(ArrayList<Length> v) {
		Length min = v.get(0);
		Length max = v.get(0);
		for(int i = 1; i < v.size(); i++) {
			if(min.toMeters() > v.get(i).toMeters())
				min = v.get(i);
			if(max.toMeters() < v.get(i).toMeters())
				max = v.get(i);
		}
		System.out.println("\nMinimum is " + min);
		System.out.println("Maximum is " + max);
	}
}
