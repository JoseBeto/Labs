package length;

/*********************************************
 * The Yard class
 * 
 * @author Jose Bocanegra
 *********************************************/

public class Yard extends Length {

	public static final double METERS_PER_YARD = 0.9144;
	
	/**
	 * Yard constructor will store length in Length class
	 * 
	 * @param length
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
