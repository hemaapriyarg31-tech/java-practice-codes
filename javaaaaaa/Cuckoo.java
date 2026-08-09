import java.util.Scanner;
public class Cuckoo {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
int a=0;
int b=1;
int c=0;
    for(int i=3;i<=n;i++){
      c=1*b+2*a+3;  
      a=b;
      b=c;
    }
       System.out.println("the cuckoo series is:"+c);
    }
  }
  

