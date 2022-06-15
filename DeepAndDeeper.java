public class DeepAndDeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
		      System.out.println("I am starting in main.");
		      deep();
		      System.out.println("Now I am back in main.");   
		    deep();
		    deep();
		    deep();
		   }
	}
		   public static void deep()
		   {
		      System.out.println("I am now in deep.");
		      deeper();
		      System.out.println("Now I am back in deep");
		      deeper();
		      deeper();
		   }
		   /**
		      The deeper method simply displays a message.
		   */
		   public static void deeper()
		   {        //just changed "" to I am in deep.
		      System.out.println("I am now in deeper.");
		      deepdeeper();
		      deepdeeper();
		   }
        public static void deepdeeper() {
        	System.out.println("I am now in deepdeeper");
	System.out.println("Now I am back in deeper");
}

}