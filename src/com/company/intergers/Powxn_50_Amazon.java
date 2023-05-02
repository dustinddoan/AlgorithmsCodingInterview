package com.company.intergers;

/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).



Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */

//algorithm
//2^14 = (2^2)^7
//ans = 1;
//if (n % 2 == 0) {
//  x = x*x;
//  n = n/2
//} else {
//  ans = ans*x;
//  n = n-1
//}

public class Powxn_50_Amazon {
  public static void main(String[] args) {

    double ans = myPow(2, -2);
    System.out.println(ans);
  }

  private static double myPow(int x, int n) {
    double ans = 1.0;
    long num = n;
    if (n < 0) num = -1 * num;
    while (num > 0) {
      if (num % 2 == 0) {
        x = x*x;
        num = num/2;
      } else {
        ans = ans * x;
        num = num - 1;
      }
    }

    if (n < 0) {
      return 1.0/ans;
    }

    return ans;
  }
}
