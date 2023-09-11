package firstprgm;

import java.util.*;

class AeeeayList1
    public static void main(String[] args){
        ArrayList<String> Prep = new ArrayList<>();
        Prep.add("We");
        Prep.add("Are");
        Prep.add("Prepsters");
        
        System.out.println("ArrayList Prep : " + Prep);
        Iterator<String> Insta = Prep.iterator();
        System.out.print("The Iterator Values in ArrayList are : ");
        while(Insta.hasNext()){
            System.out.print(Insta.next() + " ");
        }
    }
}
