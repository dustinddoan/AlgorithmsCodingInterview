package com.company.arrays;

import java.util.LinkedList;
import java.util.Queue;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

 */
public class MovesZero_283_Facebook {
  public static void main(String[] args) {
    int[] array = {0,1,0,3,12};
    int left = 0;
    for (int right = 0; right < array.length; ++right) {
      if (array[right] == 0) {
        right ++;
      }
      else {
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
      }
    }

  }


}
