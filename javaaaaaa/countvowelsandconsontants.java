import java.util.Scanner;

public class countvowelsandconsontants { 
  public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String s=sc.nextLine();

    int vowels=0;
    int conso=0;

    for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
  
  if(ch>='a'&& ch<='z'){
    if(ch!='a' &&  ch!='e' && ch!='i' && ch!='o' && ch!='u'){
      vowels++;
    }
    else{
      conso++;
    }
    
  }}
  System.out.println("the vowels are: " + vowels++);
  System.out.println("the consonats  are: " + conso++);

}}
