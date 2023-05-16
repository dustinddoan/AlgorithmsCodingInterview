package com.company.sorting;
/*
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

You must solve it in O(n) time complexity.



Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

[1,2,3,4,5,6,7] k =3  //
k_th largest element = 5 = K-_th smallest element = (n-k+1) = 5 (index)
 */
public class KthLargestSmallestElement_215_Google {
  public static void main(String[] args) {
    int[] nums = {3,2,1,5,6,4}; // 123456
    int k = 2;
    int ans = findKthLargest(nums, k);
    System.out.println(ans);
  }

  private static int findKthLargest(int[] nums, int k) {
    return quickSelect(nums, 0, nums.length - 1, nums.length - k); // transfer to k smallest
  }

  private static int quickSelect(int[] nums, int low, int high, int k) {
    int pi = partition(nums, low, high);
    if (pi == k) {
      return nums[pi];
    }
    else if (pi < k) {
      return quickSelect(nums, pi + 1, high, k);
    }
    else {
      return quickSelect(nums,low, pi - 1, k);
    }
  }

  private static int partition(int[] nums, int low, int high) {
    int pivot = nums[high];
    int i = low - 1;
    for (int j = low; j < high; j ++) {
      if (nums[j] < pivot) {
        i ++;
        swap(nums, i, j);
      }
    }
    // j reach the end of the array, now swap with i with pivot
    i++;
    swap(nums, i, high);
    return i;
  }

  private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
