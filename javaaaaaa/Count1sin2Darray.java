import java.util.Scanner;

public class Count1sin2Darray {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);

    int m=s.nextInt();
    int n=s.nextInt();

    int arr[][]=new int[m][n];

    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=s.nextInt();
      }
    }

    int max=0;
    int index=-1;

    for(int i=0;i<m;i++){
      int count=0;
            for(int j=0;j<n;j++){
              if(arr[i][j]==1){
                count++;
              }}
              if(count>max){
                max=count;
                index=i;
              }}


              System.out.println("the max no of 1s is:"+max);
            }}