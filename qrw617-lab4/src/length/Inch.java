package length;

/*********************************************
 * The Inch class will store length in Length
 * 	class. It will also add this to other once
 * 	other is converted to inches, it will 
 * 	return inch or inches depending if length
 * 	is greater or equal to 1.0, and it will
 * 	convert length to meters by multiplying 
 * 	length by METERS_PER_INCH
 * 
 * @author Jose Bocanegra
 *********************************************/

public class Inch extends Length{
	
	/**
	 * METERS_PER_INCH is a constant value that 
	 * 	equals how many meters are in an inch
	 */
	
	public static final double METERS_PER_INCH = 0.0254;

	/**
	 * Inch constructor will store length in Length class
	 * 
	 * @param length
	 */
	
	public Inch(double length) {
		super(length);
	}
	
	/*
	 * (non-Javadoc)
	 * @see length.Length#add(length.Length)
	 */

	public void add(Length other) {
		setLength(this.getLength() + (other.toMeters() / METERS_PER_INCH));
	}

	/*
	 * (non-Javadoc)
	 * @see length.Length#getUnit()
	 */
	
	public String getUnit() {
		if(getLength() == 1.0)
			return "inch";
		else
			return "inches";
	}
	
	/*
	 * (non-Javadoc)
	 * @see length.Length#toMeters()
	 */

	public double toMeters() {
		return getLength() * METERS_PER_INCH;
	}
}
