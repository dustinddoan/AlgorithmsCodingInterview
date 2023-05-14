package com.company.TwoPointers;
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 */
public class IsSubsequence_392_Google {
  public static void main(String[] args) {
//    String s = "abc", t = "ahbgdc";
//    String s = "acb", t = "ahbgdc";
    String s = "ab", t = "baab";
    System.out.println(t.indexOf("a"));
    System.out.println(t.indexOf("c"));
    System.out.println(t.indexOf("b"));
    boolean ans = isSubsequence(s, t);
    System.out.println(ans);
  }

  private static boolean isSubsequence(String s, String t) {
    int p1 = 0, p2 = 0;
    while (p1 < s.length() && p2 < t.length()) {
      if (s.charAt(p1) == t.charAt(p2)) {
        p1++;
        p2++;
      }
      else {
        p2++;
      }
    }
    return p1 == s.length();
  }
}
