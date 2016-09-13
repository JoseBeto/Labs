package lab3;

public class DateRange {

	private int i;
	Date newDate;
	Date oldDate;
	
	public DateRange(Date dNew, Date dOld) {
		this.i = dNew.compareTo(dOld);
		this.newDate = dNew;
		this.oldDate = dOld;
	}

	@Override
	public String toString() {
		String s = "DateRange: " + oldDate.getDate() + " - " + newDate.getDate();
		if(i == 1)
			return s;
		else
			return "";
	}
}
