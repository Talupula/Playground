import java.util.Scanner;
class Main{
  public static void het(int a[],int n)
  {
    for(int i=0;i<n;i++)
    {
      if(a[i]!=0)
        System.out.print(a[i]+" " );
    }
    for(int i=0;i<n;i++)
    {
      if(a[i]==0)
        System.out.print(a[i]+" " );
    }
  }
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      het(a,n);
    
    }
}