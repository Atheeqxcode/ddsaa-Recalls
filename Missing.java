public class Missing {
    public static void main(String[] args) {
    String s="";
    String t="ef";
    System.out.println(findTheDifference(s,t));    
    }
    public static char findTheDifference(String s, String t) {
        int sumS =0;
        for(char c:s.toCharArray()){
            sumS=sumS+c;
        }
        int sumT=0;
        for(char c:t.toCharArray()){
            sumT=sumT+c;
        }
        return(char)(sumT-sumS);
        }
}
