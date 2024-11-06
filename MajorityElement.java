public class MajorityElement {
   
    public static void main(String[] args) {
        int nums[]={3,2,3};
        System.out.println(majorityEle(nums));
        
    }
    public static int majorityEle(int[] nums) {
int count =0;
for(int i=0;i<nums.length;i++){
    if(nums[i] == nums[i+1] && nums[i]>1)
    {
        count++;
    }
    System.out.println(nums[count]);
}

        return 0;
        
    }
   
    
}
