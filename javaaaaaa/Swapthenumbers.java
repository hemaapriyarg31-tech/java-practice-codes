import java.util.*;
public class Swapthenumbers {
  public static void main(String[] args){
  Scanner s=new Scanner(System.in);  
  System.out.println("enter the number for a:");
  int a=s.nextInt();
    System.out.println("enter the number for b:");
    int b=s.nextInt();
  //int temp=0;

   //temp=a;
   //a=b;
   //b=temp;             //or like this in arthimetic //

   //a=a+b;
   //b=a-b;
   //a=a-b;

   a=a^b;
   b=a^b;
   a=a^b;

   System.out.println("the swap num of a is:"+a);
   System.out.println("the swap num of b is:"+b);  
}
}