import java.util.*;
public class Totalarr {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   
    int arr[]={1,9,2,11,1,9,2};
    int min=Integer.MAX_VALUE,max=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
        max=Math.max(max,arr[i]-min);
        }
        System.out.println("Minimum value in the array is: "+min);    
        System.out.println("Maximum value in the array is: "+max);    

}}