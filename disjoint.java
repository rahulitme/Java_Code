package hello;
import java.util.*;

public class disjoint {




	   //main method
	   public static void main(String[] args) {
	   
	      //Declare and initialize two array elements
	      int arr1[] = { 15, 14, 91,9, 1 };
	      int arr2[] = { 24, 2, 21, 85 };
	      
	      //declare boolean to check for disjoint or not
	      boolean flag = false;
	      
	      //logic implementation
	      for(int i = 0;i<arr1.length;i++){
	         for(int j=0;j<arr2.length;j++){
	            if(arr1[i] == arr2[j]){
	               flag = true;
	               break;
	            }
	         }
	      }
	      System.out.println("First array is: "+Arrays.toString(arr1));
	      System.out.println("Second array is: "+Arrays.toString(arr2));
	      
	      // print array are disjoint
	      if(!flag) {
	         System.out.println("The arrays are disjoint");
	         return;
	      }
	      
	      // print array are not disjoint
	      else {
	         System.out.println("The arrays are not disjoint");   
	      }
	   }
	}
