package com.ibmc.wordcounter;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        LinkedHashMap<Emp, Student> lh = new LinkedHashMap<>();
        lh.put(new Emp(111, "ratan"), new Student(1, "durga"));
        lh.put(new Emp(222, "anu"), new Student(2, "Sravya"));
        Set<Emp> e = lh.keySet();
        for (Emp ee : e)
            System.out.println(ee.eid + ":" + ee.ename);

        Collection<Student> ss = lh.values();
        for (Student s : ss)
            System.out.println(s.sid + ":" + s.sname);
        for (Student s1 : lh.values())
            System.out.println(s1.sid + ":" + s1.sname);

        Set< Map.Entry<Emp,Student>> es =lh.entrySet();
        for(Map.Entry<Emp,Student> e1:es)
        {
            Emp ee1=e1.getKey();
            Student ss1=e1.getValue();
            System.out.println(ee1.eid+":"+ee1.ename+"  ;  "+ss1.sid+":"+ss1.sname);
        }

    }
}

