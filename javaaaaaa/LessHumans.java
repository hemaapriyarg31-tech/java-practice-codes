import java.util.*;
public class LessHumans {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int arr[]={1,3,7,2,6};

    Arrays.sort(arr);
    int s=0;
    int d=0;
    
        for(int i=0;i<arr.length;i++){
        d=d+arr[i];
    }
    for(int i=arr.length-1;i>=0;i--){
      s=s+arr[i];
      d=d-arr[i];
      if(s>d){
        break;
      }}
      System.out.println("Totall power:  " + s);
    }
    }