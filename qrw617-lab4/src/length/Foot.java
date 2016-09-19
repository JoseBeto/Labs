package length;

public class Foot extends Length{

	public static final double METERS_PER_FOOT = 0.3048;
	
	public Foot(double length) {
		super(length);
	}

	public void add(Length other) {
		
	}

	public String getUnit() {
		if(getLength() == 1.0)
			return "foot";
		else
			return "feet";
	}

	public double toMeters() {
		
		return 0;
	}
}
