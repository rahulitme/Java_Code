package helo;

 class Aggrigation {
	  
		 int square(int n){  
		  return n*n;  
		 }  
		}  
		  
		class Circle{  
			Aggrigation  op;//aggregation  
		 double pi=3.14;  
		    
		 double area(int radius){  
		   op=new Aggrigation ();  
		   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
		   return pi*rsquare;  
		 }  
		  
		     
		    
		 public static void main(String args[]){  
		   Circle c=new Circle();  
		   double result=c.area(5);  
		   System.out.println(result);  
		 }  
		}  
