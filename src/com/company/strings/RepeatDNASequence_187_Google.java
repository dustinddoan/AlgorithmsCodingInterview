package com.company.strings;

import java.util.*;

/*
The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.



Example 1:

Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]
Example 2:

Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]
 */
public class RepeatDNASequence_187_Google {
  public static void main(String[] args) {
    List<String> sequences = findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
    System.out.println(sequences);
  }

  private static List<String> findRepeatedDnaSequences(String s) {
//    List<String> result = new ArrayList<>();
//    Map<String, Integer> map = new HashMap<>();
//    for (int i = 0; i <= s.length() - 10; i++) {
//      String substring = s.substring(i, i +10);
//      map.put(substring, map.getOrDefault(substring, 0) + 1);
//    }
//
//    for (Map.Entry<String, Integer> entry : map.entrySet()) {
//      if (entry.getValue() > 1) {
//        result.add(entry.getKey());
//      }
//    }
//    return result;

    Set<String> list = new HashSet<>();

    Set<String> set = new HashSet<>();
    for (int i = 0; i <= s.length() - 10; i++) {
      String substring = s.substring(i, i +10);
      if (set.contains(substring)) {
        list.add(substring);
      } else {
        set.add(substring);
      }
    }

    return new ArrayList<>(list);
  }
}
