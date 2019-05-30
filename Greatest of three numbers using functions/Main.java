import java.util.Scanner;
class Main{
  public static int lar(int a,int b)
  {
    int l=0;
    if(a>b)
      l=a;
    else
      l=b;
    return l;
  }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int r1=lar(n1,n2);
      int res=lar(r1,n3);
      System.out.println(res);
      
        
	}
}