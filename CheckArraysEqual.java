
// import java.util.Arrays; 

// public class CheckArraysEqual { 
//     public static void main(String[] args) 
//     { 
//         // Initializing the first array 
//         int a[] = { 30, 25, 40 }; 

//         // Initializing the second array 
//         int b[] = { 30, 25, 40 }; 

//         // store the result 
//         // Arrays.equals(a, b) function is used to check 
//         // whether two arrays are equal or not 
//         boolean result = Arrays.equals(a, b); 

//         // condition to check whether the 
//         // result is true or false 
//         if (result == true) { 
//             // Print the result 
//             System.out.println("Two arrays are equal"); 
//         } 
//         else { 
//             // Print the result 
//             System.out.println("Two arrays are not equal"); 
//         } 
//     } 
// }

import java.util.Arrays;

class CheckArraysEqual {
    public static void main(String args[]) {
        int a[] = { 33, 44, 55 };
        int b[] = { 3, 44, 55 };

        boolean result = Arrays.equals(a, b);
        if (result == true) {
            System.out.println("the array  elemnt is equal");
        } else {
            System.out.println("it s not equals");
        }
    }
}