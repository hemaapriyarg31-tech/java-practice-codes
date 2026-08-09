import java.util.Scanner;

public class Arr{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
  
    int n=sc.nextInt();

    int []a=new int[7];
      System.out.println("Enter the array:");

      for(int i=0;i<a.length;i++){
        a[i]= sc.nextInt();
      }   
    
  }
}