package com.ibmc.wordcounter;

import java.util.HashMap;
import java.util.Map;

public class WordCounter1 {
    public static void main(String[] args) {
        String word = "hello, welcome to java programming hello hello hello hello";
        WordCounter1 wc = new WordCounter1();
        wc.wordcounter(word);
    }
    public void wordcounter(String word)
    {
       String [] word1 = word.split(" ");
        Map<String, Integer> wordCountMap= new HashMap<>();
        for (int i=0;i<word1.length;i++) {
            Integer count = wordCountMap.get(word1[i]);
            if (count == null) {
                wordCountMap.put(word1[i], 1);
            } else {
                count++;
                wordCountMap.put(word1[i], count);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet())
            System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());

    }
}