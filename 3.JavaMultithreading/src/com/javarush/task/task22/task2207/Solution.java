package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();
    public static List<String> words;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        StringBuilder sb1 = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb1.append(line);
            sb1.append(" ");
        }
        reader.close();
        String str = sb1.toString().trim();

        // String str = "рот тор торт о о тот тот тот";

        List<String> words = new LinkedList<>(Arrays.asList(str.split(" ")));
        while (!words.isEmpty()) {
            String word = words.get(0);
            words.remove(0);
            StringBuilder sb = new StringBuilder(word);
            for (String secondWord : words) {
                if (secondWord.equals(sb.reverse().toString())) {
                    result.add(new Pair(word, secondWord));

                    System.out.println(word + " " + secondWord);
                    words.remove(secondWord);
                    break;
                }
            }


        }


    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}