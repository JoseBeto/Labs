package length;

/*********************************************
 * The Meter class
 * 
 * @author Jose Bocanegra
 *********************************************/

public class Meter extends Length{
	
	/**
	 * Meter constructor will store length in Length class
	 * 
	 * @param length
	 */
	
	public Meter(double length) {
		super(length);
	}

	/*
	 * (non-Javadoc)
	 * @see length.Length#add(length.Length)
	 */
	
	public void add(Length other) {
		setLength(this.getLength() + other.toMeters());
	}

	/*
	 * (non-Javadoc)
	 * @see length.Length#getUnit()
	 */
	
	public String getUnit() {
		if(getLength() == 1.0)
			return "meter";
		else
			return "meters";
	}

	/*
	 * (non-Javadoc)
	 * @see length.Length#toMeters()
	 */
	
	public double toMeters() {
		return getLength();
	}
}
