package length;

public class Meter extends Length{
	
	public Meter(double length) {
		super(length);
		
	}

	public void add(Length other) {
		
		
	}

	public String getUnit() {
		if(getLength() == 1.0)
			return "meter";
		else
			return "meters";
	}

	public double toMeters() {
		
		return 0;
	}
}
