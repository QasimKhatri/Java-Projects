public class ReturnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[] values;

	      values = getIntArray();
	      for (int num : values)
	         System.out.print(num + " , ");
	      getUcharArray();
	      getLcharArray();
	      getStringArray();
	   }

	   /**
	      getArray method
	      @return A reference to an array of doubles.
	   */

	   public static int[] getIntArray()
	   {
	      int[] array = { 0, 1 , 2 , 3 , 4 , 5 , 6 , 7 ,8 , 9 };

	      return array;
	 }
	   
	  public static char getUcharArray () {
		
		  //for the uppercase letters
		  char c;

		    for(c = 'A'; c <= 'Z'; ++c )
		    
		    	System.out.println( c + " ");
		  return c;
		   
		 }
		 
	 public static void getLcharArray() {
		//for the lower case letters
		 
		 char b;

		    for(b = 'a'; b <= 'z'; ++b )
		    
		    	System.out.println( b + " ");
		  return;
		  
		  
		 
		  }
		
	 public static String[] getStringArray() {
		 
		 String[] letters = new String[] {"AAA","aaa","BBB",
				 "CCC","ccc"};
		 
		 for (String AaBbCc : letters) {
			 
			 System.out.println(AaBbCc);
		
		 
		 }
		return letters;
		}  
}