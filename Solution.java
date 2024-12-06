import java.util.HashSet;

public class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
     HashSet<Integer> hs=new HashSet<>();
     for(int num:banned){
        hs.add(num);
     }

     int count=0,sum=0;
     for(int i=1;i<=n;i++){
        if(!hs.contains(i)){
            sum+=i;
            if(sum>maxSum){
                break;
            }
            count++;
        }
     }
     return count;
    }
} {
    
}
