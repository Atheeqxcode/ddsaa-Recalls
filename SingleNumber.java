public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.println(singleNum(nums));
    }

    
    public static int singleNum(int [] nums){

        int count=0;
        for(int i=0;i<nums.length;i++){
           //xor operation is performed
           count = count^nums[i];


    }
    return count;
}
}

