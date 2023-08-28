package firstprgm;

public class NewInstanceObj  
{  
String str="hello";  
public static void main(String args[])  
{  
try  
{  
//creating object of class  
	NewInstanceObj obj= NewInstanceObj.class.newInstance();   
System.out.println(obj.str);          
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  
