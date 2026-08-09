public class Ppattern{
  public static void main(String args[]){
    int num=1;

    for(int i=1;i<=5;i++){
      int start=num;
      int end=num+i-1;
      if(i%2!=0){
        for(int j=start;j<=end;j++){

        
        System.out.print(j+" ");

        }}

      
      else{
        for(int j=end;j>=start;j--){
          System.out.print(j+" ");
        }
      }
      num=end+1;
      System.out.println();
    }
  }}
