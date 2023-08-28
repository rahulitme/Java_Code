package firstprgm;
import java.lang.reflect.Constructor;  
public class NewInstanceContructorObj  
{  
String str="hello";  
public static void main(String args[])  
{  
try  
{  
Constructor<NewInstanceContructorObj> obj =NewInstanceContructorObj.class.getConstructor();  
NewInstanceContructorObj obj1 = obj.newInstance();  
System.out.println(obj1.str);  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}