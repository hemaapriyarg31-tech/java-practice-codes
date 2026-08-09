  import java.util.Scanner;
  public class countoddreven {  
  public static void main(String[] args){
  Scanner s=new Scanner(System.in);  
  System.out.println("enter the number:");
  int n=s.nextInt();

int even_count=0;
int odd_count=0;


while(n!=0){
  int a=n%10;
  if(a%2==0){
   even_count++;
  }
  else{
    odd_count++;
   }

n=n/10;}

System.out.println("even number is:"+even_count);
System.out.println("odd number is:"+odd_count);
}}