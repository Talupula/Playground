import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int temp,r;
      int d=0;
      temp=n;
      while(temp!=0)
      {
        d++;
        temp=temp/10;
      }
      temp=n;
      while(temp!=0)
      {
        r=temp%10;
        sum=sum+power(r,d);
        temp=temp/10;
      }
      if(n==sum)
        System.out.println("Armstrong Number");
      else 
        System.out.println("Not a Armstrong Number");
    }
  static int power(int n,int r)
  {
    int c,p=1;
    for(c=1;c<=r;c++)
      p=p*n;
    return p;
  }
      
	}
