// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class checkingarrays{
    public static void main(String[] args) {
        int a[]={1,2,3,342,2};
        boolean sorted=true;
        
            for(int i=0;i<a.length;i++)
            {
                if(a[i]<a[i+1])
                {
                    sorted=false;
                    break;
                    
                }
            }
            if(sorted)
            {
                    System.out.println("tghis is summer");
                }
                else{
                System.out.println("this is not sortes");
                }
            }
}
        
