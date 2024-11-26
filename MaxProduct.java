import java.util.Arrays;

public class MaxProduct {

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,-6};
        System.out.println(maximumProduct(nums));
    }
      public static int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       
        int n= nums.length;
        int opt1=nums[n-1]*nums[n-2]*nums[n-3];
        int opt2=nums[0]*nums[1]*nums[n-1];

        return Math.max(opt1,opt2);
    } 
}