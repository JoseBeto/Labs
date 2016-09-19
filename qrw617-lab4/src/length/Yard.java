package length;

public class Yard extends Length {

	public static final double METERS_PER_YARD = 0.9144;
	
	public Yard(double length) {
		super(length);
	}

	public void add(Length other) {
		setLength(this.getLength() + (other.toMeters() / METERS_PER_YARD));
	}

	public String getUnit() {
		if(getLength() == 1.0)
			return "yard";
		else
			return "yards";
	}

	public double toMeters() {
		return getLength() * METERS_PER_YARD;
	}
}
