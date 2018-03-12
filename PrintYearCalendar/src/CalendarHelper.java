import java.util.HashMap;
import java.util.Map;

public class CalendarHelper {
	
	static Map<String, Integer> monthsAndDays = new HashMap<>();
	final static String MONTHS[] = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", 
			"AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
	final static String DAYS[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	
	static{
		monthsAndDays.put("JANUARY", 31);
		monthsAndDays.put("FEBRUARY", 28);
		monthsAndDays.put("MARCH", 31);
		monthsAndDays.put("APRIL", 30);
		monthsAndDays.put("MAY", 31);
		monthsAndDays.put("JUNE", 30);
		monthsAndDays.put("JULY", 31);
		monthsAndDays.put("AUGUST", 31);
		monthsAndDays.put("SEPTEMBER", 30);
		monthsAndDays.put("OCTOBER", 31);
		monthsAndDays.put("NOVEMBER", 30);
		monthsAndDays.put("DECEMBER", 31);
	}
	
	public static int getMonthNumberOfDays(String month, int year) {
		if(month.equals("FEBRUARY") && isLeapYear(year)) {
			System.out.println("isLeapYear");
			return 29;
		}
		
		return monthsAndDays.get(month);
	}
	
	static boolean isLeapYear(int year) {
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		return false;
	}
	
	public static int toMonthNumber(String month) {
		switch(month) {
		case "JANUARY":
			return 1;
		case "FEBRUARY":
			return 2;
		case "MARCH":
			return 3;
		case "APRIL":
			return 4;
		case "MAY":
			return 5;
		case "JUNE":
			return 6;
		case "JULY":
			return 7;
		case "AUGUST":
			return 8;
		case "SEPTEMBER":
			return 9;
		case "OCTOBER":
			return 10;
		case "NOVEMBER":
			return 11;
		case "DECEMBER":
			return 12;
		default:
			return 0;

		}
	}
	
}
