public class ArrayInitialization 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] days = { 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };
		
    String [] month = {"January", "February", "March", "April",
	  "May","June", "July", "August","September", "October",
	  "November", "December" };
		
		
		for (int i = 0; i < 12; i++) 
		{
			
			System.out.println(month[i]
			+ " has "+ days	[i] + " days. ");
				
		}
		{
			System.out.println("\n");
		}
	 String[] weekdays =  {"Monday", "Tuesday", "Wednesday",
		"Thursday","Friday","Saturday", "Sunday" };
				
	 for (int day = 0; day < 7; day++)
	 {
		 
		if(day>4)
			
		 System.out.println( weekdays [day] + " is Weekend. ");
			
		else 
			System.out.println(weekdays[day] + " is Weekday");
		
	 }
		
		
}
		

	
	}
