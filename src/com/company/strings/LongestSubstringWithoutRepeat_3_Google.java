package com.company.strings;

/*
Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeat_3_Google {
  public static void main(String[] args) {
    int ans = lengthOfLongestSubstring("pwwkew");
    System.out.println(ans);
  }

  private static int lengthOfLongestSubstring(String s) {
    int ans = 0;
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    int left = 0;

    for (int right = 0; right < s.length(); right ++) {
      char ch = s.charAt(right);
      if (!map.containsKey(ch)) {
        map.put(ch, right);
      } else {
        left = Math.max(left, map.get(ch) + 1);
        map.put(ch, right);
      }

//      System.out.println("left: " + left + " right: " + right);
//      System.out.println(map);

      ans = Math.max(ans, right-left+1);
    }

    return ans;
  }
}
