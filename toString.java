package firstprgm;

public class toString{
	  public static void main(String args[]){
	    long l = 1234567L;
	    String str = String.format("%d",l);

	    //Output: "1234567"
	    System.out.println("long to String: "+str);
	  }
	}
