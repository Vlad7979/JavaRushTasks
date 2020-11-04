package com.javarush.task.task19.task1916;

import com.sun.org.apache.regexp.internal.RE;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(fileName.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(fileName.readLine()));
        //BufferedReader file1 = new BufferedReader(new FileReader("c:/git/1.txt"));
        //BufferedReader file2 = new BufferedReader(new FileReader("c:/git/2.txt"));
        fileName.close();
        List<String> line1 = new ArrayList<>();
        List<String> line2 = new ArrayList<>();
        while (file1.ready()) {
            line1.add(file1.readLine());
        }
        while (file2.ready()) {
            line2.add(file2.readLine());
        }
        line1.add(" ");
        line2.add(" ");
        file1.close();
        file2.close();
        for (int i = 0; i < line1.size();){
            for (int j = 0; j < line2.size(); ){
                if (line1.get(i).equals(line2.get(j))){
                    lines.add(new LineItem(Type.SAME, line1.get(i)));
                    i++;
                    j++;
                }
                else {
                    if (line1.get(i).equals(line2.get(j+1))){
                        lines.add(new LineItem(Type.ADDED, line2.get(j)));
                        j++;
                    }
                    else{
                        lines.add(new LineItem(Type.REMOVED, line1.get(i)));
                        i++;
                    }
                }
            }
        }
        lines.remove(lines.size() - 1);

        for (LineItem x : lines){
            System.out.println(x.type + x.line);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}