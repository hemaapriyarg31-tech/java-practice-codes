public class Countcharoccurence {
  public static void main(String[] args) {
    String a="helloworld";
    String b="do";

    char[]arr=a.toCharArray();
    char[]arr1=b.toCharArray();

    int count=0;
    for(int i=0;i<a.length();i++){
      for(int j=0;j<b.length();j++){
        arr[i]=arr1[j];
        
        }
        
      }
      count++;
              System.out.println(count);


  }
  
}
