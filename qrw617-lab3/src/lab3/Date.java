package lab3;

public class Date implements Comparable<Date> {
	
	private String date;
	private String month;
	private String day;
	private String year;
	
	public int compareTo (Date other) { // return -1 if this Date is before the other Date, 
		//0 if they are equal, and +1 if this Date is after the other Date
		return 0;
	}
	
	public Date (String line) {
		String s[] = line.split(" ", 3);
		this.month =  s[0];
		this.day = s[1];
		this.day = this.day.replace(",", "");
		this.year = s[2];
		this.date = month + " " + day + ", " + year;
	}

	public String getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		return "Date: " + date;
	}
}
