import java.util.*;
public class Charity {
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
int sum=0;
  for(int i=1;i<=n;i++){
    sum+=i*i;
  }
  System.out.println("the charaity is: " + sum);
  }}


