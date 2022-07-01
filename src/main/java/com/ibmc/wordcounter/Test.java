package com.ibmc.wordcounter;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> fruits = new HashMap<>();
        fruits.put("red", "Apple");
        fruits.put("yellow", "banana");
        fruits.put("white", "radish");
        fruits.put("green", "apple");
        System.out.println(fruits);
        System.out.println(fruits.get("green"));
        for (Map.Entry pairentry : fruits.entrySet()) {
            System.out.println(pairentry.getKey() + ":" + pairentry.getValue());
        }
        System.out.println(fruits.containsKey("green"));
        System.out.println(fruits.containsKey("black"));
        System.out.println(fruits.containsValue("apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.remove("red"));
        System.out.println(fruits);
        System.out.println(fruits.putIfAbsent("black","banana"));
        System.out.println(fruits);

    }
}
