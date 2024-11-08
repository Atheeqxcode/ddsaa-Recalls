public class ReverseStr {
    public static void main(String[] args) {
        char[] s = {'p', 'l', '0'};
        revString(s);
        System.out.println(s);
    }

    public static void revString(char[] s){
        int start=0;
        int end=s.length-1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;

        }
    }
}
