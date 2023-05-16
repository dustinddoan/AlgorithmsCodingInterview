package com.company.sorting;
/*
Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.



Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
 */
public class MergeSort {
  public static void main(String[] args) {
    int[] nums = {9, 3, 4, 1, 5, 7, 2, 6, 8, 0};
    sortArray(nums);

    for (int i : nums) {
      System.out.println(i);
    }

  }

  private static int[] sortArray(int[] nums) {
    mergeSort(nums);
    return nums;
  }

  private static void mergeSort(int[] nums) {
    int length = nums.length;
    if (length <=1 ) return; // base case

    int middle = length/2;

    int[] leftArray = new int[middle];
    int[] rightArray = new int[length - middle];

    int i = 0;
    int j = 0;

    for (; i < nums.length; i++) {
      if (i < middle) {
        leftArray[i] = nums[i];
      }
      else {
        rightArray[j] = nums[i];
        j++;
      }
    }
    System.out.print("leftArray: ");

    mergeSort(leftArray);
    for (int l : leftArray) {
      System.out.print(" " + l + " ");
    }
//    System.out.println("--");
//    System.out.print("rightArray: ");

    mergeSort(rightArray);
    for (int l : leftArray) {
      System.out.print(" " + l + " ");
    }

    merge(leftArray, rightArray, nums);
  }

  private static void merge(int[] leftArray, int[] rightArray, int[] nums) {
    int leftSize = nums.length / 2;
    int rightSize = nums.length - leftSize;

    int i = 0, l = 0, r =0;

    while (l < leftSize && r < rightSize) {
      if (leftArray[l] < rightArray[r]) {
        nums[i] = leftArray[l];
        i++;
        l++;
      }
      else {
        nums[i] = rightArray[r];
        i++;
        r++;
      }
    }
    // only one size left
    while (l < leftSize) {
      nums[i] = leftArray[l];
      i++;
      l++;
    }

    while (r < rightSize) {
      nums[i] = rightArray[r];
      i++;
      r++;
    }


  }

}
