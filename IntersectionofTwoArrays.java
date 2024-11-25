import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays {
    
    public static void main(String[] args) {
        int[] nums1={1,2,2,3,4,5,6,7};
        int nums2[]={2,2,2,3,5,6};
        int result[]=intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums1){
            set.add(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i: nums2){
            if(set.contains(i)){
                ans.add(i);
                set.remove(i);
            }
        }

        int [] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}
