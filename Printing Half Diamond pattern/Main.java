import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=1;
      for(int i=1;i<=n;i++)
      {
        for(int s=1;s<=(n-(i));s++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=k;j++)
        {
          System.out.print("*");
        }
        k=k+2;
        System.out.print("\n");
      }
      
        
	}
}