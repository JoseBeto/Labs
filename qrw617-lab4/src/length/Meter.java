package length;

/*********************************************
 * The Meter class will store length in Length
 * 	class. It will also add this to other once
 * 	other is converted to meters, it will 
 * 	return meter or meters depending if length
 * 	is greater or equal to 1.0, and it will
 * 	convert length to meters (in this case, return
 * 	length as it is).
 * 
 * @author Jose Bocanegra
 *********************************************/

public class Meter extends Length{
	
	/**
	 * Meter constructor will store length in Length class
	 * 
	 * @param length length in the units of this object
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
