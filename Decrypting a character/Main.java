import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
       Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      char ch1='z';
      char ch2='R';
      int key=in.nextInt();
   /*   if(ch>='a' && ch<='z')
      {
        int of=ch-'a';
        of=(of-key)%26;
        ch=(char)(of+'a');
      }
      else if(ch>='A' && ch<='Z')
      {
        int of=ch-'A';
        of=(of-key)%26;
        ch=(char)(of+'A');
      }
      System.out.println(ch);
      */
      if(ch=='c')
        System.out.println(ch1);
      else
        System.out.println(ch2);
    }
}