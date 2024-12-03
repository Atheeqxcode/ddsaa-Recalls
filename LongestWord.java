import java.util.Arrays;
import java.util.HashSet;

public class LongestWord {
    class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String> bw=new HashSet();
        String result="";
        for(String w:words){
            if(w.length()==1 || bw.contains(w.substring(0,w.length()-1))){
                if(w.length()>result.length())
                result=w;
                bw.add(w);
            }
        }return result;
    }
}
}
