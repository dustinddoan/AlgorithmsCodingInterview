package com.company.intergers;


/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21


Constraints:

-231 <= x <= 231 - 1
 */
public class ReverseInteger_7_Facebook {
  public static void main(String[] args) {
    int ans = reverseInt(-15342);
    System.out.println(ans);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
  }

  private static int reverseInt(int x) {
    int ans = 0;
    while (x != 0) {
      int lastDigit = x % 10;
      int newAns = ans*10 + lastDigit;

      if ((newAns-lastDigit)/10 != ans) return 0;

      ans = newAns;
      x = x /10;
    }
    return ans;
  }

//  private static int reverse(int x) {
//    int max = Integer.MAX_VALUE;
//    int min = Integer.MIN_VALUE;
////  -2147483648 < x < 2147483647
//    int ans = 0;
////    System.out.println(x/1000);
//    while (x != 0) {
//      int lastDigit = x % 10;
////      System.out.println(lastDigit);
////      System.out.println(x);
//      if (ans > max / 10 || (ans == max/10 && lastDigit > 7)) {
//        return 0;
//      }
//      if (ans < min / 10 || (ans == min/10 && lastDigit < -8)) {
//        return 0;
//      }
//
//      ans = ans*10 + lastDigit;
//      x = x /10;
//
//    }
//    System.out.println("reserve: " + ans);
//    return ans;
//  }
}
