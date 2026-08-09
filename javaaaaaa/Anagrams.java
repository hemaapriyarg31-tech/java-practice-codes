import java.util.*;
public class Anagrams {
  public static void main(String[] args) {

    String s="eat";
    String s1="eeat";

    char[] a=s.toCharArray();
    char[] b=s1.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    System.out.println(Arrays.equals(a,b)?"Anagram" : "not a anagram" );


   
    

   
    
  }
  
}
