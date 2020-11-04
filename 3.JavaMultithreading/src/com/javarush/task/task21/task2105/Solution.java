package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
        */
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (this==null)
            return false;
        if (o==null)
            return false;
        if (o == this) {
            return true;
        }
        if (!(o instanceof Solution))
            return false;
        Solution n = (Solution) o;
        return n.first==first && n.last==last;
    }

    public int hashCode() {
        if (first==null && last==null)
            return 0;
        return  first.hashCode() + last.hashCode();
    }


    public static void main(String[] args) {
/*        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));*/
        Set<Solution> s = new HashSet<>();
        Solution s1 = new Solution("Donald", "Duck");
        Solution s2 = new Solution("Donald", "Duck");
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());

        Solution s3 = new Solution(null,null);
        Solution s4 = new Solution(null, null);
        System.out.println(s3.hashCode()==s4.hashCode());

    }
}