import java.util.Scanner;

public class OctaltoBinary {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      int octal=sc.nextInt();

      int decimal=0;
      int pow=0;

      while(octal>0){
        int digit=octal%10;
        decimal=decimal+digit*(int)Math.pow(8,pow);
        octal=octal/10;
        pow++;
      }

      String binary="";
      while(decimal>0){
        int rem=decimal%2;
        binary=rem+binary;
        decimal=decimal/2;
      }

      System.out.println(binary);


    
    
    
    
    
    
    
    
    
    
    
    }}