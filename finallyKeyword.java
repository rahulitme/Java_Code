package helo;


public class finallyKeyword {   
	    public static void main(String args[]){
		// try block
	        try{			
		    // try block Statements 
	            int temp = 50/5;
	            System.out.println(temp);
	            System.out.println("I am in the try Block");    
	        }
		// catch block
	        catch(NullPointerException e){
				//catch block exceptions
	            System.out.println(e);  
	        }
		// finally block
	        finally {  
		    // finally blick statement
	            System.out.println("I am in finally block");  
	        }
	    }    
	}