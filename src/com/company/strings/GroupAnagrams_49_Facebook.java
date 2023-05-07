package com.company.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 */
public class GroupAnagrams_49_Facebook {
  public static void main(String[] args) {
    HashMap<String, List<String>> map = new HashMap<String, List<String>>();
    List<List<String>> list = new ArrayList<List<String>>();

    String[] str = {"eat","tea","tan","ate","nat","bat"};
    for (int i = 0; i < str.length; i++) {
      char[] chars = str[i].toCharArray();
      Arrays.sort(chars);
      String sortChars = new String(chars);
      System.out.println("i: " + i);

      System.out.println("sortChars: " + sortChars);
      System.out.println("str[i]: " + str[i]);

      List<String> temp = new ArrayList<>();
      if (!map.containsKey(sortChars)) {

        temp.add(str[i]);
        map.put(sortChars, temp);
        list.add(temp);
      } else {
        System.out.println("containsKey: ");
        temp = map.get(sortChars);
        System.out.println("temp: " + temp);
        temp.add(str[i]);
      }

      System.out.println(list);

    }
    System.out.println(new ArrayList<>(map.values()));


  }
}
