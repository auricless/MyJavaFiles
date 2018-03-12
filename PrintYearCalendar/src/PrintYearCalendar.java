import java.util.Scanner;

public class PrintYearCalendar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = in.nextInt();
		
		printCalendar(year);
	}
	
	static void printCalendar(int year) {
		String months[] = CalendarHelper.MONTHS;
		String days[] = CalendarHelper.DAYS;
		for(int i = 0; i < months.length; i++) {
			String currentMonth = months[i];
			printMonthHeader(year, currentMonth, days);
			printMonthBody(year, currentMonth);
			System.out.println("\n");
		}
		
	}
	
	static void printMonthHeader(int year, String currentMonth, String days[]) {
		System.out.println("       " + currentMonth + " " + year);
		for(int j = 0; j < days.length; j++) {
			System.out.print(days[j] + " ");
		}
		System.out.print("\n");
	}
	
	static void printMonthBody(int year, String currentMonth) {
		int startDay = getStartDay(year, currentMonth);
		int numberOfDays = CalendarHelper.getMonthNumberOfDays(currentMonth, year);
		int daysPerWeek = 0;
		
		for(int i = 0; i < startDay; i++) {
			System.out.print("    ");
		}
		
		for(int i = 1; i <= numberOfDays; i++) {
			boolean isWeekComplete = false;
			int dayLength = i;
			
			System.out.print(" " + i);
			if(i < 9) {
				System.out.print("  ");
			}else {
				System.out.print(" ");
			}
			
			daysPerWeek++;
			if(i + startDay == 7) {
				isWeekComplete = true;
			}else if(daysPerWeek == 7) {
				isWeekComplete = true;
			}
			
			if(isWeekComplete) {
				System.out.println();
				daysPerWeek = 0;
			}
			
		}
		
	}
	
	static int getStartDay(int year, String currentMonth) {
		final int DAY_OF_JAN_01_1900 = 1;
		final int YEAR_1900 = 1900;
		int totalNumberOfDays = 0;
		String months[] = CalendarHelper.MONTHS;
		
		for(int i = YEAR_1900; i < year; i++) {
			if(CalendarHelper.isLeapYear(i)) {
				totalNumberOfDays += 366;
			}else {
				totalNumberOfDays += 365;
			}
		}

		int addDaysUntilMonth = CalendarHelper.toMonthNumber(getPriorMonthDays(currentMonth, year)); 
		
		for(int i = 0; i < addDaysUntilMonth; i++) {
			totalNumberOfDays += CalendarHelper.getMonthNumberOfDays(months[i], year);
		}
		
		return (DAY_OF_JAN_01_1900 + totalNumberOfDays) % 7;
		
	}
	
	static String getPriorMonthDays(String currentMonth, int year) {
		switch(currentMonth) {
			case "JANUARY":
				return "";
			case "FEBRUARY":
				return "JANUARY";
			case "MARCH":
				return "FEBRUARY";
			case "APRIL":
				return "MARCH";
			case "MAY":
				return "APRIL";
			case "JUNE":
				return "MAY";
			case "JULY":
				return "JUNE";
			case "AUGUST":
				return "JULY";
			case "SEPTEMBER":
				return "AUGUST";
			case "OCTOBER":
				return "SEPTEMBER";
			case "NOVEMBER":
				return "OCTOBER";
			case "DECEMBER":
				return "NOVEMBER";
			default:
				return "";
		}
		
	}
	
}