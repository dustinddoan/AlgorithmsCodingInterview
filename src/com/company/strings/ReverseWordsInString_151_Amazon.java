package com.company.strings;

import java.util.ArrayList;
import java.util.List;

/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWordsInString_151_Amazon {
  public static void main(String[] args) {
    String s = "  hello world  ";
    char[] words = s.toCharArray();

    // reverse string
    reverse(words, 0, words.length - 1);

    // reverse word in string
    reverseWords(words);

    // empty whitespace
    String ans = cleanSpace(words);

    System.out.println(ans);
  }

  private static String cleanSpace(char[] str) {
    int left = 0, right = 0;
    while (right < str.length) {
      while (right < str.length && str[right] == ' ') right ++;
      while (right < str.length && str[right] != ' ') {
        str[left] = str[right];
        left ++;
        right ++;
      }

      while(right < str.length && str[right] == ' ') right ++;
      if (right < str.length) {
        str[left] = ' ';
        left ++;
      }

    }

    return new String(str).substring(0, left);
  }

  private static void reverseWords(char[] str) {
    int left = 0, right = 0;
    while (left < str.length) {
      // white space
      while (left < str.length && str[left] == ' ') left ++;
      right = left;

      // character
      while (right < str.length && str[right] != ' ') right ++;
      reverse(str, left, right - 1);
      left = right;
    }
  }

  private static void reverse(char[] str, int left, int right) {
    while (left < right) {
      char temp = str[left];
      str[left] = str[right];
      str[right] = temp;
      left ++;
      right --;
    }
  }
}
