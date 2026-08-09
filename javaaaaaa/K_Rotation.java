public class K_Rotation {
  public static void main(String[] args) {
    

    String s1="ABCDE";
    String s2="CDAAB";
    String s3=s1+s1;


  if(s1.length()==s2.length()){

    if(s3.contains(s2)){
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
  }
  
}}
