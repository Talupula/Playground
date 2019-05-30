import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int temp,r,i,fact;
      int sum=0;
      int num=in.nextInt();
      temp=num;
      while(temp>0)
      {
        fact=1;
        i=1;
        r=temp%10;
        while(i<=r)
        {
          fact=fact*i;
          i++;
        }
        sum=sum+fact;
        temp=temp/10;
      }
      if(num==sum)
      System.out.println("Yes");
      else
        System.out.println("No");
      
      
	}
}