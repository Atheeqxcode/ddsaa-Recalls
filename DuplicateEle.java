import java.util.HashSet;

public class DuplicateEle {
    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5,6,7};
        System.out.println(containsDuplicate(nums));
    }
    
    public static boolean containsDuplicate(int[] nums) {
       HashSet <Integer> Seen = new HashSet<>();

       
        for(int i=0;i<nums.length;i++){
            if(Seen.contains(nums[i])){
                return true;
            }
            Seen.add(nums[i]);

        }  return false;        
    }
}

