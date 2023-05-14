package com.company.arrays;
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217_Google {
  public static void main(String[] args) {
    int[] nums = {1,1,1,3,3,4,3,2,4,2};
//    int[] nums = {1,2,3,1};
//    int[] nums = {7,10,5,5,6,6,4,10,5,4,9,4,9,6,5,9,6,3,6,5,6,7,7,4,9,9,10,5,8,1,8,3,2,7,5,10,1,8,5,8,4,3,6,4,9,4,2,8,3,2,2,1,5,6,3,2,6,1,8,6,2,9,1,4,5,10,8,5,10,5,10,1,4,8,3,6,4,10,9,1,1,1,2,2,9,6,6,8,1,9,2,5,5,2,1,8,5,2,3,10};
    boolean ans = containsDuplicate(nums);
    System.out.println(ans);
  }

  public static boolean containsDuplicate(int[] nums) {
//    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//    boolean ans = false;
//    for (int i = 0; i < nums.length; i++) {
//      if (!map.containsKey(nums[i])) {
//        map.put(nums[i], 1);
//      }
//      else {
//        map.put(nums[i], map.get(nums[i]) + 1);
//      }
//    }
//    System.out.println(map);
//    for (int count : map.keySet()) {
//      System.out.println(map.get(count));
//      if (map.get(count) >= 2) {
//        return true;
//      }
//    }
//    return false;
    // using set
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (!set.contains(nums[i])) {
        set.add(nums[i]);
      }
      else {
        return true;
      }
    }
    return false;
  }
}
