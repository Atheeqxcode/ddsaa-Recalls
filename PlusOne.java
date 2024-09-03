import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int digits[] = {9,9,9};
        int result[]=plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                    digits[i]++;
                    return digits;
            }
            digits[i]=0;
        }
        int [] NewNum= new int[n+1];
        NewNum[0]=1;

        return NewNum;

    }
}
