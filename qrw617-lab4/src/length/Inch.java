package length;

public class Inch extends Length{
	
	public static final double METERS_PER_INCH = 0.0254;

	public Inch(double length) {
		super(length);
		
	}

	public void add(Length other) {
		
		
	}

	public String getUnit() {
		if(getLength() == 1.0)
			return "inch";
		else
			return "inches";
	}

	public double toMeters() {
		
		return 0;
	}
}
