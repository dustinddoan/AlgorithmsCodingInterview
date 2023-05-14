package com.company.binary_search;
/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 */
public class BinarySearch_704_oracle {
  public static void main(String[] args) {
    int[] nums = {-1,0,3,5,9,12};
    int target = 9;
    int ans = search(nums,target);
    System.out.println(ans);
  }

  private static int search(int[] nums, int target) {
    int lowIndex = 0;
    int highIndex = nums.length;

    while (lowIndex <= highIndex) {
      int middleIndex = lowIndex + (highIndex - lowIndex)/2;
      int midValue = nums[middleIndex];
      if (midValue < target) {
        lowIndex = middleIndex + 1;
      }
      else if (target < midValue) {
        highIndex = middleIndex - 1;
      }
      else return middleIndex;
    }

    return -1;
  }
}
