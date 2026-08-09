import java.util.*;


public class Sumofnaturalnumber {

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the natural number:");
    int a=sc.nextInt();
    int sum=0;

    if(a<=0){
      System.out.println("check the number");
    }

    for(int i=0;i<=a;i++){
      sum=sum+i;

    }
System.out.println(sum);

  }
}
