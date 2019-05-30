import java.util.Scanner;
class Main{
  public static int prime(int n)
  {
    int num=1;
    int c=0;
    while(num<=n)
    {
      if(n%num==0)
        c++;
      num++;
    }
    return c;
  }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        int r=prime(i);
        if(r==2)
          System.out.println(i);
      }
  
      
	}
}