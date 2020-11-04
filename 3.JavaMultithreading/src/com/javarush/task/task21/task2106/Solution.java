package com.javarush.task.task21.task2106;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
Ошибка в equals/hashCode
*/
public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    public Solution() {

    }

    @Override
    public boolean equals(Object o) {

        if (o == null && this == null)  //1
            return false;

        if (this == o) return true;
        if (!(o instanceof Solution)) return false;  //добавил !

        Solution solution1 = (Solution) o;

        if (Double.compare(solution1.aDouble, aDouble) != 0) return false;
        if (anInt != solution1.anInt) return false;
        //if (date != null ? !date.equals(solution1.date) : solution1.date == null) return false;
        //код выше с ошибкой, если 2 даты нул вернёт, false
        if (!Objects.equals(date, solution1.date)) return false;
        //if (solution != null ? !solution.equals(solution1.solution) : solution1.solution == null) return false;
        if (!Objects.equals(solution, solution1.solution)) return false;
        //if (string != null ? !string.equals(solution1.string) : solution1.string == null) return false;
        if (!Objects.equals(string, solution1.string)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        if (this == null)  //добавил
            return 0;
        int result;
        long temp;
        result = anInt;
        temp = aDouble != +0.0d ? Double.doubleToLongBits(aDouble) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        Solution s1 = new Solution(1, "23", 3, date, null);
        Solution s2 = new Solution(1, "23", 3, date, null);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());

        Set<Solution> set = new HashSet<>();
        Solution solution = new Solution(5, "Ooops!", 2.5d, new SimpleDateFormat("dd.MM.yyyy").parse("24.03.2020"), new Solution());
        set.add(solution);
        System.out.println(set.contains(new Solution(5, "Ooops!", 2.5d, new SimpleDateFormat("dd.MM.yyyy").parse("24.03.2020"), new Solution())));

    }
}