import java.util.Scanner;
  public class BinarytoDecimal {  
  public static void main(String[] args){
  Scanner s=new Scanner(System.in);  
   String binary=s.nextLine();

    int decimal=0;
    int power=0;
   

    for(int i=binary.length()-1;i>=0;i--){
    //  decimal=decimal+(binary.charAt(i)-'0')*(int)Math.pow(2,power);  //bin to dec
    decimal=decimal+(binary.charAt(i)-'0')*(int)Math.pow(8,power);   //oct to dec 
   //decimal=decimal+(binary.charAt(i)-'0')*(int)Math.pow(16,power);   //hex to dec
      power++;
    }
System.out.println(decimal);
  }}