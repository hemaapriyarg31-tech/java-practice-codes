  import java.util.Scanner;
  public class removedigits {  
  public static void main(String[] args){
  Scanner s=new Scanner(System.in);  
  System.out.println("enter the string:");
  String word=s.nextLine();

   String result=word.replaceAll("[^a-zA-Z]", "");

   System.out.print(result);




  
}}
