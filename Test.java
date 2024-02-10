package studentCourseManagement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test 
{
	static protected Calendar now;

	String registeredDate()
	{
	now = Calendar.getInstance();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	return dateFormat.format(now.getTime());
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.registeredDate();
	}
}
