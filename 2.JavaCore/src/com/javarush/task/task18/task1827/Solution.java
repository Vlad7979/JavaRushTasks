package com.javarush.task.task18.task1827;

/*
Прайсы
*/


import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        try{
            if (args[0].equals("-c")) {
                BufferedReader read = new BufferedReader(new FileReader(fileName));
                int max;
                int id = 0;
                while (read.ready()) {
                    max = Integer.parseInt(read.readLine().substring(0,8).trim());
                    if (max > id) id = max;
                }
                read.close();
                String idStr = formatString(Integer.toString(++id), 8);
                String productName = formatString(args[1], 30);
                String price = formatString(args[2], 8);
                String quantity = formatString(args[3], 4);
                String line = "\n" + idStr + productName + price + quantity ;
                FileWriter fos = new FileWriter(fileName, true);
                fos.write(line);
                fos.close();
            }
        }catch (Exception e){
            //System.out.println(e);
        }

    }
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


}