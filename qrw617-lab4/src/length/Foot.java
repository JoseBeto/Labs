package length;

public class Foot extends Length{

	public static final double METERS_PER_FOOT = 0.3048;
	
	public Foot(double length) {
		super(length);
	}

	public void add(Length other) {
		setLength(this.getLength() + (other.toMeters() / METERS_PER_FOOT));
	}

	public String getUnit() {
		if(getLength() == 1.0)
			return "foot";
		else
			return "feet";
	}

	public double toMeters() {
		return getLength() * METERS_PER_FOOT;
	}
}
