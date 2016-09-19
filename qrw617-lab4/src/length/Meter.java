package length;

public class Meter extends Length{
	
	public Meter(double length) {
		super(length);
	}

	public void add(Length other) {
		setLength(this.getLength() + other.toMeters());
	}

	public String getUnit() {
		if(getLength() == 1.0)
			return "meter";
		else
			return "meters";
	}

	public double toMeters() {
		return getLength();
	}
}
