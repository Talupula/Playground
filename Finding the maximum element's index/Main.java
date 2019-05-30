import java.util.Scanner;
class Main
{
  public static int max(int a[],int n)
  {
    int max=0;
    int j=0;
    for(int i=0;i<n;i++)
    {
      if(max<a[i])
      {
        max=a[i];
        j=i;
      }
    }
    return j;
  }
  
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int res=max(a,n);
    System.out.println(res);
  
  }
}