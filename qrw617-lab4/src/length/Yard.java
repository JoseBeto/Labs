package length;

public class Yard extends Length {

	public static final double METERS_PER_YARD = 0.9144;
	
	public Yard(double length) {
		super(length);
		
	}

	public void add(Length other) {
		
		
	}

	public String getUnit() {
		if(getLength() == 1.0)
			return "yard";
		else
			return "yards";
	}

	public double toMeters() {
		
		return 0;
	}
}
