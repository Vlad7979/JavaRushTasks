package com.javarush.task.task18.task1828;

/*
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String formatString(String string, int length){
        String str;
        if(string.length() > length){
            str = string.substring(0, length);
        }
        else{
            str = string + new String(new char[length - string.length()]).replace("\0", " ");
        }
        return str;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader fileNameRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = fileNameRead.readLine();
        fileNameRead.close();

        if(args[0].equals("-u")||args[0].equals("-d")){
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            ArrayList<String> list = new ArrayList<>();
            while(reader.ready()){
                String string = reader.readLine();
                if (args[0].equals("-u") && string.startsWith(args[1] + " ")){
                    String idStr = formatString(args[1], 8);
                    String productName = formatString(args[2], 30);
                    String price = formatString(args[3], 8);
                    String quantity = formatString(args[4], 4);
                    String line = idStr + productName + price + quantity;
                    list.add(line);
                }
                else if (args[0].equals("-d") && string.startsWith(args[1] + " ")){
                }
                else {
                    list.add(string);
                }
            }
            reader.close();
            for(String x : list){
                writer.write(x+ "\n");
            }
            writer.close();
        }

    }
}