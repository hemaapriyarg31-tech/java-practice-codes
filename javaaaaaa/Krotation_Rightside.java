public class Krotation_Rightside {
  public static void main(String[] args) {
    
    int[] arr={1,3,5,7,9};
    int k=2;
    int n=arr.length;

    for(int r=0;r<=k;r++){
      int first=arr[0];
    

    for(int i=0;i<n-1;i++){
      arr[i]=arr[i+1];

    }
    arr[n-1]=first;
    }
    for(int i:arr){
      System.out.print(i + " ");
    }
  
}}
