import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import length.Length;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Length>
		Scanner in = null;
		try {
		    in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
		    throw new RuntimeException("failed to open data.txt");
		}
		// need more code for other parts of this assignment
		while (in.hasNextDouble()) {
		    double value = in.nextDouble();
		    String unit = in.next();
		    Length length = null;
		    // code here to use the value of unit to create the
		    // right type of Length object and store it in length.
		    System.out.println(length);
		    // need more code for other parts of this assignment
		}
		in.close();
		// need more code for other parts of this assignment
	}

}

/* Output:
 * class length.Meter: 1.0 meter
 * class length.Inch: 1.0 inch
 * class length.Foot: 1.0 foot
 * class length.Yard: 1.0 yard
 * class length.Meter: 401.336 meters
 * class length.Inch: 15839.0 inches
 * class length.Foot: 1319.0 feet
 * class length.Yard: 439.0 yards
 * 
 * Minimum is class length.Inch: 1.0 inch
 * Maximum is class length.Inch: 15839.0 inches
 * 
 * Sum of Lengths Adding from First to Last
 * class length.Meter: 1609.344 meters
 * class length.Inch: 63360.0 inches
 * class length.Foot: 5280.0 feet
 * class length.Yard: 1760.0 yards
 * 
 * Sum of Lengths Adding from Last to First
 * class length.Meter: 1609.3439999999998 meters
 * class length.Inch: 63360.0 inches
 * class length.Foot: 5279.999999999999 feet
 * class length.Yard: 1760.0 yards
 */
