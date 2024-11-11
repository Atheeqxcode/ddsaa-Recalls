import java.util.HashMap;

public class Patternmatch {
    public static void main(String[] args) {  // Corrected the parameter name to 'args'
        String pattern = "acca";
        String s = "Atheeq Anees Anees Atheeq";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");  // Split on spaces to get individual words
        if (pattern.length() != arr.length) {  // Use length() for the string pattern
            return false;
        }

        HashMap<Character, String> hm = new HashMap<>();  // Correct HashMap initialization

        for (int i = 0; i < arr.length; i++) {
            char ch = pattern.charAt(i);

            if (hm.containsKey(ch)) {  // Check if the key exists in the map
                if (!hm.get(ch).equals(arr[i])) {  // Check if the value matches arr[i]
                    return false;
                }
            } else {
                if (hm.containsValue(arr[i])) {  // Check if the value is already mapped to another key
                    return false;
                }
                hm.put(ch, arr[i]);  // Add the new character-word mapping to the map
            }
        }
        return true;  // Return true if the entire pattern matches
    }
}
