public class Longprefix {
    public static void main(String[] args) {
        String[] strs = { "Atheeq", "Athu", "Att" };
        String s=longestCommonPrefix(strs);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {
      String prefix=strs[0];
        for (int o=1;o<prefix.length();o++){
            while(!strs[o].startsWith(prefix)){
                prefix=prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                return " ";
            }
          

        }
    }return prefix;
}
}
