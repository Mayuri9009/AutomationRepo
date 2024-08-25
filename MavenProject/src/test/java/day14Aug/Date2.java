package day14Aug;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal  = Calendar.getInstance();	    
		cal.add(Calendar.DATE, -1);
		SimpleDateFormat s= new SimpleDateFormat("dd-MMM-yyyy");
		String date= s.format(new Date(cal.getTimeInMillis()));
		System.out.println(date);
		System.out.println("***************************************");
		
		Calendar cal2= Calendar.getInstance();
		cal.add(Calendar.MONTH, 5);
		SimpleDateFormat s2 = new SimpleDateFormat("dd-MMM-yyyy");
		String date2 =s2.format(new Date(cal2.getTimeInMillis()));
		System.out.println(date2);
		
		System.out.println("***************************************");
		
		Calendar cal3 = cal.getInstance();
		cal3.add(Calendar.YEAR, 2);
		SimpleDateFormat s3 = new SimpleDateFormat("dd-MMM-yyyy");
		String date3 = s3.format(new Date(cal3.getTimeInMillis()));
		System.out.println(date3);
		
		
	}

}
