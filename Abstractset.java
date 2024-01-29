package hello;
import java.util.*;
public class Abstractset {

	
	 
	    // Main driver method
	    public static void main(String[] args) throws Exception
	    {
	        // Try block to check for exceptions
	        try {
	 
	            // Creating an empty TreeSet of integer type by
	            // creating object of AbstractSet
	            AbstractSet<Integer> abs_set
	                = new TreeSet<Integer>();
	 
	            // Populating TreeSet
	            // using add() method
	            abs_set.add(1);
	            abs_set.add(2);
	            abs_set.add(3);
	            abs_set.add(4);
	            abs_set.add(5);
	 
	            // Printing the elements inside above TreeSet
	            System.out.println("AbstractSet: " + abs_set);
	        }
	 
	        // Catch block to handle the exceptions
	        catch (Exception e) {
	 
	            // Display exception on console
	            System.out.println(e);
	        }
	    }
	}
