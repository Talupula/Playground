import java.util.Scanner;
public class Main{
  public static int gcd(int a,int b)
  {
    int min,gcd=0;
    if(a<b)
      min=a;
    else
      min=b;
    while(min>=1)
    {
      if((a%min==0)&&(b%min==0))
      {
        gcd=min;
        break;
      }
      min--;
    }
    return gcd;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int r1=gcd(n1,n2);
      int res=gcd(r1,n3);
      System.out.println(res);
      
	}
}