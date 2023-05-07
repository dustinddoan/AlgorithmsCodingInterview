package com.company.strings;

import java.util.Arrays;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */
public class ValidAnagram_242_Facebook {
  public static void main(String[] args) {
    boolean ans = isAnagram("anagram", "nagaram");
    System.out.println(ans);
  }

  private static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    char[] chart = t.toCharArray();
    Arrays.sort(chart);
    return new String(chars).equals(new String(chart));
  }
}
