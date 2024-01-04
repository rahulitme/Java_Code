package hello;
import java.util.ArrayList;
import java.util.List;
public class Listdemo {

	public static void main(String[] args) {
//		 List<Integer> li = new ArrayList<>();
//		 li.add(1);
//		 li.add(2);
//		 li.add(4);
//		 li.add(5);
//		 li.add(6);
//		 li.remove(2);
		List<String>li= new ArrayList<>();
		li.add("hello");
		li.add("how");
		li.add("you");
		
		 String first = li.get(0);
		 String sec = li.get(1);
		 String third = li.get(2);
		 
		
		 System.out.println(first);
		 System.out.println(sec);
		 System.out.println(third);
		 
		
		
	}

}
