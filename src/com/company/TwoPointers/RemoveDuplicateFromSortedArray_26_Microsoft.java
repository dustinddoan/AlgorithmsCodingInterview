package com.company.TwoPointers;

public class RemoveDuplicateFromSortedArray_26_Microsoft {
  public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
   int left = 0;
   int right = 0;
    while (right < nums.length) {
      if (nums[left] != nums[right]) {
        left++;
        nums[left] = nums[right];
      }
      right++;
    }


    for (int i = 0; i < nums.length; i ++) {
      System.out.println(nums[i]);
    }
  }
}
