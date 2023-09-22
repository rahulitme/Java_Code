package helo;

class InstanceOf{}  
class Dog1 extends InstanceOf{//Dog inherits Animal  
  
 public static void main(String args[]){  
 Dog1 d=new Dog1();  
 System.out.println(d instanceof InstanceOf);//true  
 }  
} 
