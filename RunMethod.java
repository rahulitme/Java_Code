package helo;

public class RunMethod {
	

	  // Function Definition	
	  public static void run(int count) {
	    if (count == 0) {
	      return;
	    }
	    System.out.println("Running the function: " + count);
	    
		// Function calling itself  
		run(count - 1);
	  }

	  public static void main(String[] args) {
	    int count = 5;
		 
		// Function calling  
	    run(count);
	  }
	}
