package com.java.algothrim.String;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>,List<String>> collection = new HashMap<>();
        Map<String,List<Integer>> table = new HashMap<>();

        List<List<String>> result = new ArrayList<>();
        for (String s : strs) {
            Integer[] counts = new Integer[26];
            Arrays.fill(counts, 0);
            List<Integer> count = Arrays.asList(counts);


            for (char ch: s.toCharArray()) {
                count.set(ch - 97 , count.get(ch - 97) + 1) ;
            }
            List<String> words = collection.getOrDefault(count,new ArrayList<>());
            words.add(s);
            collection.put(count,words);
            table.put(s,count);

        }

        for (String s : strs) {
            List<Integer> count = table.get(s);

            if(collection.containsKey(count)){
                List<String> words = collection.get(count);
                collection.remove(count);
                result.add(words);
            }

        }

        return result;
    }


    /*
    using sorted string as key, List<String> that share the same sorted string as value
     */
    public static List<List<String>> groupAnagrams1(String[] strs) {
        Map<String,List<String>> collection = new HashMap<>();
        Map<String,String> table = new HashMap<>();

        List<List<String>> result = new ArrayList<>();
        for (String s : strs) {
           char[] sortedCharArray =s.toCharArray();
           Arrays.sort(sortedCharArray);
           String sortString = new String(sortedCharArray);

           List<String> valueList = collection.getOrDefault(sortString,new ArrayList<>());
           valueList.add(s);
           collection.put(sortString,valueList);

           table.put(s,sortString);

        }

        for (String s : strs) {
            String count = table.get(s);

            if(collection.containsKey(count)){
                List<String> words = collection.get(count);
                collection.remove(count);
                result.add(words);
            }

        }

        return result;
    }
}
