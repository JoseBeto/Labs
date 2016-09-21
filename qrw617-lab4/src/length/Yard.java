package length;

/*********************************************
 * The Yard class will store length in Length
 * 	class. It will also add this to other once
 * 	other is converted to yards, it will 
 * 	return yard or yards depending if length
 * 	is greater or equal to 1.0, and it will
 * 	convert length to meters by multiplying 
 * 	length by METERS_PER_YARD
 * 
 * @author Jose Bocanegra
 *********************************************/

public class Yard extends Length {
	
	/**
	 * METERS_PER_YARD is a constant value that 
	 * 	equals how many meters are in a yard
	 */

	public static final double METERS_PER_YARD = 0.9144;
	
	/**
	 * Yard constructor will store length in Length class
	 * 
	 * @param length length in the units of this object
	 */
	
	public Yard(double length) {
		super(length);
	}
	
	/*
	 * (non-Javadoc)
	 * @see length.Length#add(length.Length)
	 */

	public void add(Length other) {
		setLength(this.getLength() + (other.toMeters() / METERS_PER_YARD));
	}
	
	/*
	 * (non-Javadoc)
	 * @see length.Length#getUnit()
	 */

	public String getUnit() {
		if(getLength() == 1.0)
			return "yard";
		else
			return "yards";
	}
	
	/*
	 * (non-Javadoc)
	 * @see length.Length#toMeters()
	 */

	public double toMeters() {
		return getLength() * METERS_PER_YARD;
	}
}
