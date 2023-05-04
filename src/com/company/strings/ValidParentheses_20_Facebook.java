package com.company.strings;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses_20_Facebook {
  public static void main(String[] args) {
    boolean ans = isValid("(()[]{})");

    System.out.println(ans);
  }

  private static boolean isValid(String s) {
    if (s.length() % 2 != 0) return false;
    // construc hash map data structure

    HashMap<Character, Character> map = new HashMap<Character, Character>();
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');

    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length(); i ++) {
      char ch = s.charAt(i);
      if (!map.containsKey(ch)) {
        // put opening into the stack;
        stack.push(ch);

        // now if map contain key which is closing
        // get that value and compare with stack
      } else {
        char pop = stack.size() != 0 ? stack.pop() : '#';
        if (pop != map.get(ch)) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
