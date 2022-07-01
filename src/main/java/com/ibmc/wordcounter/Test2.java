package com.ibmc.wordcounter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<Integer, String> h = new HashMap<>();
        h.put(111, "ratan");
        h.put(222, "anu");
        h.put(333, "sravya");
        h.put(444, "durga");
        System.out.println(h);

        Set<Integer> s = h.keySet();
        System.out.println(s);
        System.out.println(h.keySet());

        Collection<String> c = h.values();
        System.out.println(c);
        System.out.println(h.values());

        Set<Map.Entry<Integer, String>> s1 = h.entrySet();
        for (Map.Entry<Integer, String> e : s1) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}
