package assignment.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {
	public static void main(String arg[]){
		Date mydate=new Date();
		SimpleDateFormat format=new SimpleDateFormat("EEE MMM dd HH:mm:ss:z: yyyy ");
		format.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(format.format(mydate));
		format=new SimpleDateFormat("yy/m/dd h:mm a ");
		System.out.println(format.format(mydate));
		format=new SimpleDateFormat("h:mm:ss a ");
		System.out.println(format.format(mydate));
		format=new SimpleDateFormat("mm d,yyyy h:mm:ss a");
		System.out.println(format.format(mydate));
		format=new SimpleDateFormat("h:mm a");
		System.out.println(format.format(mydate));
		format=new SimpleDateFormat("h:mm:ss a ");
		System.out.println(format.format(mydate));
		format=new SimpleDateFormat("h:mm:ss a z");
		format.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(format.format(mydate));
		format=new SimpleDateFormat("MM/d/yy h:mm a");
		System.out.println(format.format(mydate));
		format=new SimpleDateFormat("MMM d,yyyy h:mm a");
		System.out.println(format.format(mydate));
		format=new SimpleDateFormat("MMMMMM d,yyyy h:mm:ss a z");
		format.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(format.format(mydate));
		
		
		
	}

}
