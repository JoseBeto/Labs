package length;

public class Inch extends Length{
	
	public static final double METERS_PER_INCH = 0.0254;

	public Inch(double length) {
		super(length);
	}

	public void add(Length other) {
		setLength(this.getLength() + (other.toMeters() / METERS_PER_INCH));
	}

	public String getUnit() {
		if(getLength() == 1.0)
			return "inch";
		else
			return "inches";
	}

	public double toMeters() {
		return getLength() * METERS_PER_INCH;
	}
}
