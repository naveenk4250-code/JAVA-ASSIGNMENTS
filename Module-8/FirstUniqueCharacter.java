// LeetCode 387 - First Unique Character in a String (Easy)

import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter fc = new FirstUniqueCharacter();
        System.out.println(fc.firstUniqChar("leetcode"));
        System.out.println(fc.firstUniqChar("loveleetcode"));
        System.out.println(fc.firstUniqChar("aabb"));
    }
}
