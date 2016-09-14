package lab3;

public class Date implements Comparable<Date> {
	
	private String date;
	private int month;
	private int day;
	private int year;
	private int invDate; // 1 = Correct date. 0 = Incorrect date.
	private static final int[] DAYS_PER_MONTH = { 0, 31, 28, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31 };
	private static final String[] MONTHS = { "", "January", "February",
			"March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
	
	public int compareTo (Date other) { // return -1 if this Date is before the other Date, 
		//0 if they are equal, and +1 if this Date is after the other Date
		if(this.year < other.year)
			return -1;
		else if(this.year > other.year)
			return 1;
		else { //this.year == other.year
			if(this.month < other.month)
				return -1;
			else if(this.month > other.month)
				return 1;
			else { //this.month == other.month
				if(this.day < other.day)
					return -1;
				else if(this.day > other.day)
					return 1;
				else //this.day == other.day, this == other
					return 0;
			}
		}
	}
	
	public Date () {
		this.date = "";
		this.month = 0;
		this.day = 0;
		this.year = 0;
		this.invDate = 0;
	}
	
	public Date (String line) {
		String s[] = line.split(" ", 3);
		this.month =  monthToNum(s[0].replace(".", ""));
		if(this.month == 0)
			this.invDate = 0;
		else {
			s[1] = s[1].replaceAll(",", "");
			this.day = checkDayOfMonth(Integer.valueOf(s[1]));
			if(this.day == 0)
				this.invDate = 0;
			else {
				this.invDate = 1;
				this.year = Integer.valueOf(s[2]);
				this.date = MONTHS[month] + " " + day + ", " + year;
			}
		}
	}
	
	@Override
	public String toString() {
		if (invDate == 0)
			return "Invalid Date";
		else
			return "Date: " + date;
	}
	
	public String getDate() {
		return date;
	}
	
	public int checkDayOfMonth(int i) {
		if (i <= DAYS_PER_MONTH[month] && i > 0)
			return i;
		else
			return 0;
	}
	
	public int monthToNum (String s) {
		if (s.equalsIgnoreCase("jan") || s.equalsIgnoreCase("january"))
			return 1;
		else if (s.equalsIgnoreCase("feb") || s.equalsIgnoreCase("february"))
			return 2;
		else if (s.equalsIgnoreCase("mar") || s.equalsIgnoreCase("march"))
			return 3;
		else if (s.equalsIgnoreCase("apr") || s.equalsIgnoreCase("april"))
			return 4;
		else if (s.equalsIgnoreCase("may"))
			return 5;
		else if (s.equalsIgnoreCase("jun") || s.equalsIgnoreCase("june"))
			return 6;
		else if (s.equalsIgnoreCase("jul") || s.equalsIgnoreCase("july"))
			return 7;
		else if (s.equalsIgnoreCase("aug") || s.equalsIgnoreCase("august"))
			return 8;
		else if (s.equalsIgnoreCase("sep") || s.equalsIgnoreCase("sept") || s.equalsIgnoreCase("september"))
			return 9;
		else if (s.equalsIgnoreCase("oct") || s.equalsIgnoreCase("october"))
			return 10;
		else if (s.equalsIgnoreCase("nov") || s.equalsIgnoreCase("november"))
			return 11;
		else if (s.equalsIgnoreCase("dec") || s.equalsIgnoreCase("december"))
			return 12;
		else
			return 0;
	}
}
