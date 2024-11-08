public class LengthOfWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Atheeq ur rehmannnn"));
    }

    public static int lengthOfLastWord(String s) {
        int Count=0;
       String str= s.trim();
       for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                Count++;
            }
            else{
                break;
            }
       } return Count;
    }
}
