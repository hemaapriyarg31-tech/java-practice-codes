import java.util.*;


public class Moveaerostotheend {
  public static void main(String[] args) {
    
   int[] a={4,5,3,20,8,8,0,1,0,0,5};

    int left=0;  
    int k=0;  
    for(int i=0;i<a.length;i++){
      if (a[i]!=0){
        a[k++]=a[i];
        }
    }
    while(k<a.length){
      a[k++]=0;
     }
     System.out.println(Arrays.toString(a));
    
  }
  
}
