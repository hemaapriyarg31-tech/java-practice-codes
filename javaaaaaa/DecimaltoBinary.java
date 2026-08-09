
  import java.util.*;
  public class DecimaltoBinary {   
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  int decimal=sc.nextInt();

  String binary="";

  while (decimal>0) {
    int rem=decimal%2;
    binary=rem+binary;
    decimal=decimal/2;
    
  }
  System.out.println("binary:"+binary);  
}}
