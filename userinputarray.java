import java.util.Scanner;
class userinputarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int six=sc.nextInt();
     int number[]=new int[six];
     
     for(int i=1;i<number.length;i++){
         number[i]=sc.nextInt();
     }
     
     for(int i=1;i<six;i++)
     {
         System.out.println(number[i]);
     }
    }
}