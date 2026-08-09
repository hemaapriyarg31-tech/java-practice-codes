public class Onestringisrotationof_another {
  public static void main(String[] args) {
    
    String a="abcde";
    String b="ebfcd";
    String c=a+a;

    if(a.length()==b.length()){

      if(c.contains(b)){
        System.out.println("true");
      }
      else{
        System.out.println("false");
      }
    }


  }
  
}
