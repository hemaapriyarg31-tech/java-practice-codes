public class Goodnum {
  public static void main(String[] args) {
    int num=19;
    int n=num;
    int sum=0;

    while(n!=0){
      int digit=n%10;
      sum=sum+digit;
      n=n/10;
    }
    if(num%sum==0){
       System.out.println("Good number");
    }
    else{
       System.out.println("Not a good number");
    }
    
  }
  
}
