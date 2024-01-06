package hello;


	
	import java.util.*;
	 
	class arraylist {
	    public static void main(String[] args)
	    {
	        // Size of ArrayList
	        int n = 5;
	 
	        // Declaring the List with initial size n
	    List<Integer> arrli=new ArrayList<Integer>();
	    for(int i=1;i<=n;i++)
	    {
	    	arrli.add(i);
	    }
	 
	        // Printing elements
	        System.out.println(arrli);
	 
	        // Remove element at index 3
	        arrli.remove(3);
	 
	        // Displaying the list after deletion
	        System.out.println(arrli);
	 
	        // Printing elements one by one
	        for (int i = 0; i < arrli.size(); i++)
	            System.out.print(arrli.get(i) + " ");
	    }
	}
