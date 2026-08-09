import java.util.Scanner;

public class replaceall{
    public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  
  System.out.println("Enter the string:");
  String a=s.nextLine();

  //String word=a.replaceAll(".","*");
  //String word=a.replace(".","$");
  String word=a.replaceFirst(".","*");
  System.out.println(word);



  }}