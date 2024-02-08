package hello;
public class sumofdigit
{
  public static void main (String[]args)
  {

    int num = 12345;
      System.out.println ("Sum of digits : " + getSum (num));
  }

  static int getSum (int num)
  {

    if (num == 0)
      return 0;

    return (num % 10) + getSum (num / 10);
  }

}
