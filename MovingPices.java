class Solution {
    public boolean canChange(String start, String target) {
         int n = start.length();
        
        int first = 0, second = 0;
        
        // Count the occurrences of 'L' and 'R' in both strings
        int countLStart = 0, countLTarget = 0;
        int countRStart = 0, countRTarget = 0;
        
        // Count the 'L' and 'R' characters in both strings
        for (int i = 0; i < n; i++) {
            if (start.charAt(i) == 'L') countLStart++;
            if (target.charAt(i) == 'L') countLTarget++;
            if (start.charAt(i) == 'R') countRStart++;
            if (target.charAt(i) == 'R') countRTarget++;
        }
        
        // If the number of 'L' or 'R' doesn't match, return false
        if (countLStart != countLTarget || countRStart != countRTarget) {
            return false;
        }
        
        // Main loop: Traverse both strings
        while (first < n) {
            // Skip spaces in both strings
            first = skipSpaces(start, n, first);
            second = skipSpaces(target, n, second);
            
            // If both pointers reached the end of the strings simultaneously, we're done
            if (first == n && second == n) {
                return true;
            }
            
            // If one string ends before the other, it's not possible to transform
            if (first == n || second == n) {
                return false;
            }
            
            // If characters don't match, return false
            if (start.charAt(first) != target.charAt(second)) {
                return false;
            }

            // Movement rules for 'L' and 'R'
            if (start.charAt(first) == 'L' && second > first) {
                return false; // 'L' can't move to the right
            }
            if (start.charAt(first) == 'R' && first > second) {
                return false; // 'R' can't move to the left
            }
            
            // Move to the next character in both strings
            first++;
            second++;
        }

        return true;
    }

    // Helper method to skip spaces (underscore '_')
    private int skipSpaces(String s, int n, int pos) {
        while (pos < n && s.charAt(pos) == '_') {
            pos++; // Skip the space
        }
        return pos;
    }
}
