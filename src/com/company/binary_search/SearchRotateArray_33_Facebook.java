package com.company.binary_search;
/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 */
public class SearchRotateArray_33_Facebook {
  public static void main(String[] args) {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 0;
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right-left)/2;
      int midValue = nums[mid];
      if (midValue == target) System.out.println("mid: " + mid);;

      if (nums[left] < midValue) { // left to md is sorted
        if (nums[left] <= target && target < midValue) { // target in this portion
          right = mid - 1;
        }
        else {
          left = mid + 1;
        }
      }
      else { // mid to right is sorted
        if (midValue < target && target <= nums[right]) { // target in this portion
          left = mid + 1;
        }
        else {
          right = mid-1;
        }
      }

    }
    System.out.println(-1);
  }
}
