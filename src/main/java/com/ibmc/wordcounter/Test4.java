package com.ibmc.wordcounter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Map<Integer,String> h= new HashMap<>();
        h.put(101,"bindu");
        h.put(102,"binu");
        h.put(103,"swathy");
        h.put(104,"shwetha");
        System.out.println(h);

        Set<Integer> s= h.keySet();
        System.out.println(s);
        System.out.println(h.keySet());

        Collection<String> c = h.values();
        System.out.println(c);
        System.out.println(h.values());

        Set<Map.Entry<Integer,String>> e = h.entrySet();
        for(Map.Entry<Integer,String> s1:e)
        {
            System.out.println(s1.getKey()+":"+s1.getValue());
        }
    }
}
