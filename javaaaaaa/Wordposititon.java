import java.util.Scanner;

public class Wordposititon { 
  public static void main(String[] args){
  Scanner s=new Scanner(System.in);  
  System.out.println("enter the string:");
  String word=s.nextLine();

  System.out.println("Enter the characther of the string:");
  char ch=s.next().charAt(0);

  int pos=word.indexOf(0);

  if (pos!=-1){
    System.out.println("position of your characther is "+(pos+1));
  }
  else{
    System.out.println(" invalid characther ");
  }
  }}
