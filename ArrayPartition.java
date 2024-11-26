import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int nums[]={1,5,3,4};
        System.out.println(arrayPairSum(nums));
    }

    
    public static int arrayPairSum(int[] nums) {
         int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
           sum=sum+Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }
}

