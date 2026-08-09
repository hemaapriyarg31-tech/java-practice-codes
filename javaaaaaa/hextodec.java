import java.util.Scanner;

public class hextodec {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    String hexa="1A";
    int decimal=0;
    int pow=0;

    for(int i=hexa.length()-1;i>=0;i--){
    if(Character.isDigit(hexa.charAt(i))){
      decimal=decimal+(hexa.charAt(i)-'0')*(int)Math.pow(16,pow);
    }

    else{
        decimal=decimal+(hexa.charAt(i)-55)*(int)Math.pow(16,pow);
    }

    pow++; 
    }
  System.out.println(decimal);
}}
