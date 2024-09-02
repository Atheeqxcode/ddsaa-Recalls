public class RemoveEle {
    
        public static void main(String[] args){
            int nums[]= {3,2,2,3,5,7,2,2};
            int val=2;
            System.out.println(RemoveArray(nums,val));
            
    
        }
    
        public static int  RemoveArray(int [] nums , int val){
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[count] = nums[i];
                    count++;
    
    
                }
                
                
            }
            return count;
        }
       
    }
    

