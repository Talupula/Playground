import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner in=new Scanner(System.in);
  int s=in.nextInt();
  int a[]=new int[s];
  for(int i=0;i<s;i++)
  {
    a[i]=in.nextInt();
  }
  int f=in.nextInt();
  int f1=in.nextInt();
 int w1=-1;
  int w2=-1;
  for(int i=0;i<s;i++)
  {
    if(a[i]==f)
       w1=i;
    else if(a[i]==f1)
       
w2=i;      //System.out.println(i);
  }
   System.out.println(w1);
   System.out.println(w2);
       
      
      
  
}
}
