package day14Aug;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1= new Date();
		System.out.println("Date "  +d1);
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy");
		String CurrentDate = sf.format(d1);
		System.out.println("Current date: "+CurrentDate);
	}

}
