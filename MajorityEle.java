public class MajorityEle {
    public static void main(String[] args) {
        int nums[]={1,2,2,1,2,2};
        System.out.print(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count=0;
        int cand=0;
 
        for (int i=0;i<nums.length;i++){
         if(count==0){
             cand=nums[i];
         }
         if(nums[i]==cand){
             count++;
         }else{
             count--;
         }}
           count = 0; 
         for (int i : nums) {
             if (i == cand) {
                 count++;
             }
         }
          if (count > nums.length / 2) {
        
        return cand;}return cand;
     }
}
