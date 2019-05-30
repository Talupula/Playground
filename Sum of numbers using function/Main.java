import java.util.Scanner;
class Main{
  public static int sum(int m)
  {
    int sums=0;
    for(int i=1;i<=m;i++)
      sums=sums+i;
    return sums;
  }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=sum(n);
      System.out.println(s);
      

    }
}