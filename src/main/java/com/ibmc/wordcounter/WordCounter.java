package com.ibmc.wordcounter;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


public class WordCounter {
    static Logger logger = Logger.getLogger(WordCounter.class);

    public static void main(String[] args) {
        //System.out.println("hello world");
        logger.info("hello world");
        String s = "hello world hello world welcome to java";
        WordCounter wc = new WordCounter();
        Map<String, Integer> wordCountMap = wc.getWordCounts(s);
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            // System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
            logger.info("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }

    public Map<String, Integer> getWordCounts(String s) {
        Map<String, Integer> wordCountMap = new HashMap();
        if (s == null) {
            return wordCountMap;
        }
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            Integer count = wordCountMap.get(words[i]);
            if (count == null) {
                wordCountMap.put(words[i], 1);
            } else {
                count++;
                wordCountMap.put(words[i], count);
            }
        }
        return wordCountMap;
    }
}
