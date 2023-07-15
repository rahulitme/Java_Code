import java.util.Scanner;

class atm {
    public static void main(String[] args) {
        
        int  money=1000;
        int with,dep;
        Scannner sc =new Scanner(System.in);
        while(true)
        {
           System.out.println("Enter your choice:\n1. Check available balance\n2. Deposit money\n3. Withdraw money\n4. Exit");
            int choice = sc.nextInt();
             
     
        switch (choice) {
          case 1:
              System.out.println("total avail  is" +  money);
              break;
        }
            
            case 2:
             System.out.println("enter you  dep amount");
            dep = sc.nextInt();
            money = money+dep;
             System.out.println("total money"+ money);
             break;
             
        }
        case 3:
            System.out.println("enter the withdraw amount");
                with = sc.nextInt();
                
                    if(with <= money)
                    {
                        money=money-with;
                    
                    System.out.println("your with dram amount is succefull" + money);
                    }
                    else{
                         System.out.println("insufficent amout");
                     
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
                    
                    default:
                    System.out.println("invalid choice");
                    break;
                }
}}}
