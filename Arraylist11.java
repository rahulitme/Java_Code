import java.util.*;
 
public class InterviewBit {
   public static void main(String[] args)
       throws Exception
   {
       try {
 
           // creating object of ArrayList<String>
           List<String> sample_list = new ArrayList<String>();
 
           sample_list.add(“practice”);
           sample_list.add(“solve”);
           sample_list.add(“interview”);
 
           // displaying the initial list
           System.out.println("The initial list is : "
                              + sample_list);
 
           // using unmodifiableList() method
           List<String>
               read_only_list = Collections
                                   .unmodifiableList(sample_list);
 
           // displaying the read-only list
           System.out.println("The ReadOnly ArrayList is : "
                              + read_only_list);
 
           // Trying to add an element to the read-only list
           System.out.println("Trying to modify the ReadOnly ArrayList.");                       
           read_only_list.add(“job”);
       }
 
       catch (UnsupportedOperationException e) {
           System.out.println("The exception thrown is : " + e);
       }
   }
}