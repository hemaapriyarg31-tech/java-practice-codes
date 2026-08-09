public class factorialwithoutmultianddiv {
  public static void main(String[] args) {
    int n=5;
    int fact=1;

    for(int i=2;i<=n;i++){
      int temp=0;

      for(int j=0;j<i;j++){
        temp=temp+fact;
      }
      fact=temp;
    }
    System.out.println("the factorial of your number is:"+fact);
  }
  
}
