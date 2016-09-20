package length;

/*********************************************
 * The Foot class
 * 
 * @author Jose Bocanegra
 *********************************************/

public class Foot extends Length{

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
