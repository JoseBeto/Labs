package lab3;

/***********************************************
 * 
 * DateRange class receives two Date variables,
 * 	one old and one new to compare them using
 * 	a function within the Date class. It then
 * 	stores that information within the DateRange
 * 	class variable i. DateRange also contains
 * 	a toString function to ensure DateRange
 * 	output is in the correct format.
 * 
 * @author Jose Bocanegra
 * 
 ***********************************************/

public class DateRange {

	private int i;
	private Date newDate;
	private Date oldDate;
	
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
		return "DateRange: " + oldDate.toString() + " - " + newDate.toString();
	}
}
