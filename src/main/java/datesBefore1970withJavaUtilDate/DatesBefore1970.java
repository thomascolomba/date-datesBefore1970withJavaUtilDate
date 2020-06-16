package datesBefore1970withJavaUtilDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesBefore1970 {
	public static void main(String[] args) {
		showYear1970();
		showYear1969();
		showYear1900();
		showYear1899();
		showYear2();
		showYear1();
		showYear0();//note to myself : year 0 does not exist
		showYearMinus1();
		showYearMinus2();
	}
	
	private static void showYear1970() {
		String sDate = "1970-01-01 00:00:00";
		Date myDate = null;
		try {
			myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("showYear1970");
		System.out.println(myDate.getYear());
	}

	private static void showYear1969() {
		String sDate = "1969-01-01 00:00:00";
		Date myDate = null;
		try {
			myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("showYear1969");
		System.out.println(myDate.getYear());
	}
	
	private static void showYear1900() {
		String sDate = "1900-01-01 00:00:00";
		Date myDate = null;
		try {
			myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("showYear1900");
		System.out.println(myDate.getYear());
	}
	
	private static void showYear1899() {
		String sDate = "1899-01-01 00:00:00";
		Date myDate = null;
		try {
			myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("showYear1899");
		System.out.println(myDate.getYear());
	}
	
	private static void showYear2() {
		String sDate = "0002-01-01 00:00:00";
		Date myDate = null;
		try {
			myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("showYear2");
		System.out.println(myDate.getYear());
	}
	
	private static void showYear1() {
		String sDate = "0001-01-01 00:00:00";
		Date myDate = null;
		try {
			myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("showYear1");
		System.out.println(myDate.getYear());
	}
	
	private static void showYear0() {
		String sDate = "0000-01-01 00:00:00";
		Date myDate = null;
		try {
			myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("showYear0");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss G").format(myDate));
	}
	
	private static void showYearMinus1() {
		String sDate = "-1-01-01 00:00:00";
		Date myDate = null;
		try {
			myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate);//goes year 2 instead of -1
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("showYearMinus1");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss G").format(myDate));
	}
	
	private static void showYearMinus2() {
		System.out.println("showYearMinus2");
		String sDate = "-0002-01-01 00:00:00";
		Date myDate = null;
		try {
			myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate);//goes year 3 instead of -2
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss G").format(myDate));
	}
}
