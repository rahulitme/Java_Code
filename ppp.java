package hello;

public class ppp {
    public static void main(String args[]) {
        String s1 = "ukkdoeoo";
        int count = 0;
        int countp = 0;
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'k')
            {
            	
                count++;
            }
            else if(ch[i]=='o')
            {
            	countp++;
            }
        }
        System.out.println("totoal l latter"+count);
        System.out.println("total latter o"+countp);
    }
}
