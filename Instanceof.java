package helo;



class Instanceof { }  

class Dog3 extends Instanceof {  
  static void method(Instanceof a) {  
    if(a instanceof Dog3){  
       Dog3 d=(Dog3)a;//downcasting  
       System.out.println("ok downcasting performed");  
    }  
  }  
   
  public static void main (String [] args) {  
	  Instanceof a=new Dog3();  
    Dog3.method(a);  
  }  
    
 }