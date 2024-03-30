package hello;
import java.util.*;
public class Divisor {


	 

	    public static void main(String[] args)
	    {
	        int  n = 7, x = 2 ;
	        int count = 0;
	    
	        for(int i=1; i<=n; i++){
	        
	            //variable to count the factors of i-th number
	            int count_factors = 0;
	            for(int j = 1; j<= i; j++){
	                if(i%j==0){
	                    count_factors++;
	                }
	            }
	        
	        if(count_factors == x)
	            count++;
	    }
	        System.out.println(count);
	    }
	}
