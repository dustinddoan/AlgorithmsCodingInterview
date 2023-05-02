package com.company.intergers;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 */

// brute force solution approach
public class SingleNumber_136_Amazon {
  public static void main(String[] args) {
    int[] nums = {4,4,2,1,2};
    int ans = singleNumber(nums);
    System.out.println("answer:" + ans);
  }

  private static int singleNumber(int[] nums) {
//    if (nums.length == 0) return nums[0];
//    Set<Integer> set = new HashSet<Integer>();
//    for (int i = 0; i < nums.length; i++) {
//      if (!set.contains(nums[i])){
//        set.add(nums[i]);
//      } else {
//        set.remove(nums[i]);
//      }
//    }
////    System.out.println(set.hashCode());
//    return set.hashCode();

    if (nums.length == 0) return nums[0];
    int ans = nums[0];
    for (int i = 1; i < nums.length; i ++) {
      ans = ans ^ nums[i];
    }
    System.out.println(ans);
    return ans;
  }
}
