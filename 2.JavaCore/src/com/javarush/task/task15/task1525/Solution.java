package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static
    {

        try
        {
            FileInputStream fstream = new FileInputStream(Statics.FILE_NAME);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while (br.ready())
            {

                String s= br.readLine();
                lines.add(s);

            }
            br.close();
            fstream.close();

           /* for (int i = 0; i <lines.size() ; i++)
            {
                System.out.println(lines.get(i));
            }*/

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
