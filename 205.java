// Example 1:

// Input: s = "egg", t = "add"

// Output: true

// Explanation:

// The strings s and t can be made identical by:

// Mapping 'e' to 'a'.
// Mapping 'g' to 'd'.
// Example 2:

// Input: s = "foo", t = "bar"

// Output: false

// Explanation:

// The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

// Example 3:

// Input: s = "paper", t = "title"

// Output: true

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] lastS = new int[256];
        int[] lastT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (lastS[c1] != lastT[c2]){ 
                return false;
            }
            lastS[c1] = i + 1;
            lastT[c2] = i + 1;
        }

        return true;
    }
}
