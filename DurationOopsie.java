package studentCourseManagement;

public class DurationOopsie extends RuntimeException 
{
	public DurationOopsie(String message)
	{
		super(message);
	}

	    public static void main(String[] args)
	    {
	    	try
	    	{
	           int duration = 5;
	           if (duration != 1 && duration != 2 && duration != 3 && duration != 4) 
	           {
	               throw new DurationOopsie("Invalid duration value: " + duration);
	           }
	        }
	    	catch (DurationOopsie t)
	    	{
	    		System.out.println(t.getMessage());
	    	}
	  }
}
