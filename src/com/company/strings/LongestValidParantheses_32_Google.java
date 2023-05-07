package com.company.strings;

import java.util.Stack;

/*
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses
substring
.



Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:

Input: s = ""
Output: 0
 */
public class LongestValidParantheses_32_Google {
  public static void main(String[] args) {
    String s = ")((()))";
    int ans = longestValidParentheses(s);
    System.out.println(ans);
  }

  private static int longestValidParentheses(String s) {
    int ans = 0;
    Stack<Integer>  stack = new Stack<Integer>();
    stack.push(-1);
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(') {
        stack.push(i);
      } else {
        stack.pop();
        if (stack.size() == 0) {
          stack.push(i);
        } else {
          ans = Math.max(ans, i - stack.peek());
        }
      }
    }

    return ans;
  }
}
