
public class Date {
	public int day;
	public int month;
	public int year;
	
	public Date() {
		day=10;
		month=08;
		year=2018;
		
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	} 
	
	public void display() {
		System.out.println("dd:-"+day+"/t");
		System.out.println("mm:-"+month+"/t");
		System.out.println("yy:-"+month+"/t");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	}

}
