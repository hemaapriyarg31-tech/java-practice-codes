public class Patterns {
  public static void main(String[] args) {

    int[] nums = {2, 5, 1, 9, 3};
    int max = nums[0];

    for(int i = 1; i < nums.length; i++){
      if(nums[i] > max){
        max = nums[i];
      }
    }

    System.out.println("Maximum number is: " + max);
  }
}