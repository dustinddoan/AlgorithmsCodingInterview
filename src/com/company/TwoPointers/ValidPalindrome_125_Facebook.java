package com.company.TwoPointers;
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */

import java.util.Locale;

public class ValidPalindrome_125_Facebook {
  public static void main(String[] args) {
//    String s = "A man, a plan, a canal: Panama";
    String s = "race a car";
    boolean ans = isPalindrome(s);
    System.out.println(ans);

  }

  private static boolean isPalindrome(String s) {
    if (s.isEmpty()) return true;
    int p1 = 0;
    int p2 = s.length() - 1;
    while (p1 <= p2) {
      char c1 = s.charAt(p1);
      char c2 = s.charAt(p2);
      if (!Character.isLetterOrDigit(c1)) p1++;
      else if (!Character.isLetterOrDigit(c2)) p2--;
      else {
        if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
          return false;
        }
        p1++;
        p2--;
      }
    }

    return true;
  }
}
