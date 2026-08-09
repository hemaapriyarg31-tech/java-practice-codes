import java.util.*;

public class Ascoddanddeceveninarray {

   public static void main(String args[]){
    

    int[] a={21,2,3,4,8,12,15,18};
    int[] b=new int[a.length];
    Arrays.sort(a);

    int start=0;
    int end=a.length-1;

    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
        b[end]=a[i];
        end--;
      }
      else{
        b[start]=a[i];
        start++;

      }
    }
    System.out.println(Arrays.toString(b));  
}}
