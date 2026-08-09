import java.util.Scanner;

public class Split {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String s=sc.nextLine();


    String ss[]=s.split(":");
    for(String sss:ss){
      System.out.println("the string is:"+ss);
    }

  
}}
