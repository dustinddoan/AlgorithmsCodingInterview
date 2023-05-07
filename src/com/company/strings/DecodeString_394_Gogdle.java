package com.company.strings;

/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.



Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
 */


// u sing 2 STACK variables + StringBuilder

import java.util.Stack;


public class DecodeString_394_Gogdle {
  public static void main(String[] args) {
    String ans = decodeString( "3[a2[c]]");
    System.out.println(ans);
  }

  private static String decodeString(String s) {

    Stack<Integer> numStack = new Stack<>();
    Stack<StringBuilder> strStack = new Stack<>();
    StringBuilder sb = new StringBuilder();

    int num = 0;
    for (char ch : s.toCharArray()) {
      if (ch >= '0' && ch <= '9') {
        num = num * 10 + ch -'0';
        System.out.println("num = " + num);
      }
      else if (ch == '[') {
        numStack.push(num);
        strStack.push(sb);

        System.out.println("numStack: " + numStack + " - strStack: " + strStack);
        System.out.println("sb: " + sb);

        sb = new StringBuilder();
        num = 0;
      }
      else if (ch == ']') {
        int count = numStack.pop();
        StringBuilder temp = new StringBuilder(strStack.pop());

        while (count -- > 0) {
          temp.append(sb);
        }

        sb = temp;
        System.out.println("sb1: " + sb);
      }
      else {
        sb.append(ch);
      }
    }

    return sb.toString();
  }
}
