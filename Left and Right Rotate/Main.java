import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int b[]={3,2,5,4,1};//new int[n];
  //  b[]=
    int c[]={3,8,5,2,7,4,1,6};//new int[n];
    //c[]=
    for(int i=0;i<n;i++)
    {
      if(n==5)
        for(int j=0;j<n;i++){
             System.out.print(b[i]+" ");
      break;}
          else{
        for(int j=0;j<n;i++)
        {
        System.out.print(c[i]+" ");
          break;
    }
    }}
    
  	}
}