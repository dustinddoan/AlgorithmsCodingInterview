package com.company.strings;

/*
Given a string s, return the longest
palindromic

substring
 in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */

public class LongestPalindromicSubString_5_Facebook {
  static int start = 0;
  static int end = 0;

  public static void main(String[] args) {
    String ans = longestPalindrome("babad");
    System.out.println(ans);
  }

  private static String longestPalindrome(String s) {
    for (int i = 0; i < s.length(); i++) {
      expandAroundCenter(s, i, i);
      expandAroundCenter(s, i, i + 1);
    }
    System.out.println("start = " + start + " end: " + end);
    return s.substring(start, end + 1);
  }

  private static void expandAroundCenter(String s, int left, int right) {
    // keep expanding from center if those value equals
    while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left --;
      right ++;
    }
    // last 2 item s.charAt(left) and s.charAt(right) not euqual
    // move inward 1 to get the right start and end index
    left ++;
    right --;

    if (end - start < right - left) {
      start = left;
      end = right;
    }
  }
}
