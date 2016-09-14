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
	
	public int getI () {
		return i;
	}

	@Override
	public String toString() {
		String oD = oldDate.getDate();
		String nD = newDate.getDate();
		return "DateRange: Date: " + oD + " - Date: " + nD;
	}
}
