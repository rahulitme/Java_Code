// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.HashSet; 
import java.util.Vector;
class Main {
    public static void main(String[] args) {
        // ArrayList<Integer>list = new ArrayList<Integer>();
        // List linkedList = new LinkedList<Integer>();
        Vector<Integer> vector= new Vector<Integer>();
         vector.add(10);
         vector.add(12);
          vector.add(13);
        //  Stack<Integer> s1 = new Stack<Integer>();
        //  s1.add(4);
         HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
         hs.add(2);
          hs.add(3);

     
        System.out.println(hs);
    }
}


//if statement + for
import java.util.ArrayList;
import java.util.List;
class Main {
    public static void main(String[] args) {
        List<String>li = new ArrayList<>();
        li.add("3");
        li.add("5");
        li.add("2");
   if (li.size() >= 2) {
    for (String p : li) {
        System.out.println(p);
    }
}


        // Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        int arr1[] = {4,5,6,7,8};
        List<Integer> li = new ArrayList<>();
    for(int num : arr)
        {
            li.add(num);
        }
    for(int num :arr1)
        {
            li.add(num);
        }
        
    System.out.println("this sum of union" + li);
        
    }
}
[1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 8] //union
