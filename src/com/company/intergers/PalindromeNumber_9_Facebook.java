package com.company.intergers;

/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */


public class PalindromeNumber_9_Facebook {
  public static void main(String[] args) {
    boolean ans = isPalindrome(12121);
    System.out.println(ans);
  }

  private static boolean isPalindrome(int x) {
    if (x <0 || (x%10 ==0)) return false;
    if (x==0) return true;
    int reverseNum = 0;
    while (x > reverseNum) {
      int lastDigit = x % 10;
      reverseNum = reverseNum* 10 + lastDigit;
      x = x /10;
    }
    if (x == reverseNum || x == reverseNum/10) return true;
    return false;
  }
}
