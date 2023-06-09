package com.company.TwoPointers;
/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */

import java.util.Arrays;

public class SquareSortedArray_977_Facebook {
  public static void main(String[] args) {
    int[] nums = {-7,-3,2,3,11};
    int left = 0, right = nums.length -1;
    int[] ans = new int[nums.length];
    int index = nums.length -1;
    while (left <= right) {
      int tmp = Math.max(nums[left]*nums[left], nums[right]*nums[right]);
      System.out.println(index + " - " + tmp);
      ans[index] = tmp;
      index --;
      if (Math.abs(nums[left]) < Math.abs(nums[right])) {
        right --;
      } else {
        left ++;
      }
    }


    for (int i : ans) {
      System.out.println(i);
    }
  }
}
