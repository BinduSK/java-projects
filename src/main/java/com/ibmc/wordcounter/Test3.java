package com.ibmc.wordcounter;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Map<String,String> h = new HashMap<>();
        h.put("name1","bindu");
        h.put("name2","binu");
        h.put("name3","swathy");
        h.put("name4","shwetha");
        System.out.println(h);

        Set<String> s = h.keySet();
        System.out.println(s);
        System.out.println(h.keySet());

        Collection<String> c= h.values();
        System.out.println(c);
        System.out.println(h.values());

        Set<Map.Entry<String,String>> s1 = h.entrySet();
        for (Map.Entry<String,String> e:s1)
            System.out.println(e.getKey()+":"+e.getValue());
    }
}
