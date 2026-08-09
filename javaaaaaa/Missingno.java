import java.util.*;
public class Missingno {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int arr[]=new int[n-1];
    int d=0;
    for(int i=1;i<n-1;i++){
      arr[i]=sc.nextInt();
      d+=arr[i];
    }

    int s=n*((n+1)/2);
    int sum=s-d;

    System.out.println("the missing number is: "+ sum);
    
}
}