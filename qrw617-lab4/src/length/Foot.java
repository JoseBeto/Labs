package length;

/*********************************************
 * The Foot class will store length in Length
 * 	class. It will also add this to other once
 * 	other is converted to feet, it will 
 * 	return foot or feet depending if length
 * 	is greater or equal to 1.0, and it will
 * 	convert length to meters by multiplying 
 * 	length by METERS_PER_FOOT
 * 
 * @author Jose Bocanegra
 *********************************************/

public class Foot extends Length{

	/**
	 * METERS_PER_FOOT is a constant value that 
	 * 	equals how many meters are in a foot
	 */
	
	public static final double METERS_PER_FOOT = 0.3048;
	
	/**
	 * Foot constructor will store length in Length class
	 * 
	 * @param length
	 */
	
	public Foot(double length) {
		super(length);
	}

	/*
	 * (non-Javadoc)
	 * @see length.Length#add(length.Length)
	 */
	
	public void add(Length other) {
		setLength(this.getLength() + (other.toMeters() / METERS_PER_FOOT));
	}

	/*
	 * (non-Javadoc)
	 * @see length.Length#getUnit()
	 */
	
	public String getUnit() {
		if(getLength() == 1.0)
			return "foot";
		else
			return "feet";
	}
	
	/*
	 * (non-Javadoc)
	 * @see length.Length#toMeters()
	 */

	public double toMeters() {
		return getLength() * METERS_PER_FOOT;
	}
}
