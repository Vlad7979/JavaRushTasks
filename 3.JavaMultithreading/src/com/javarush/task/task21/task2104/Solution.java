package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }


    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (obj instanceof Solution) {
            return ((Solution) obj).first == first && ((Solution) obj).last == last;
        } else return false;
    }

    public int hashCode() {
        if (first == null && last == null)
            return 0;

        return first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        Solution s1 = new Solution("Donald", "Duck");
        Solution s2 = new Solution("Donald", "Duck");
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}