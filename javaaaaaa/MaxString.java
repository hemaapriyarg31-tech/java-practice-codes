public class MaxString {
  public static void main(String args[])
  {
    String str1[] = {"Hello","Good","Morning","Chellow"};
    int ind=-1,maxLen=0;
for(int i=0;i<str1.length;i++){
    if(str1[i].length()>maxLen){
        maxLen=str1[i].length();
        ind=i;
    }
}
System.out.println("Maximum string is: " + str1[ind]);

  }
}