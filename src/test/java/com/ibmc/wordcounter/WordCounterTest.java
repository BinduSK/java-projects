package com.ibmc.wordcounter;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void getWordCounts_test() {
        String s = "hello world hello world hello world java";
        WordCounter wc = new WordCounter();
        Map<String, Integer> wordCountMap = wc.getWordCounts(s);
        assertEquals(3,wordCountMap.get("hello"));
        assertEquals(3,wordCountMap.get("world"));
        assertEquals(1,wordCountMap.get("java"));
    }

    @Test
    void getWordCounts_EmptyString() {
        String s = "";
        WordCounter wc = new WordCounter();
        Map<String, Integer> wordCountMap = wc.getWordCounts(s);
        assertEquals(1,wordCountMap.get(""));
    }

    @Test
    void getWordCounts_NullString() {
        String s = null;
        WordCounter wc = new WordCounter();
        Map<String, Integer> wordCountMap = wc.getWordCounts(s);
        assertEquals(0,wordCountMap.size());
    }
}