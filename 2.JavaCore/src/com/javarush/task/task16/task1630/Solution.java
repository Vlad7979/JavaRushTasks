package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String out = "";

        String fileName;

        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            if (out == null) return "";
            else return  out.trim() ;
        }
        @Override
        public void run() {
            try {
                String s;
                FileInputStream fis = new FileInputStream(fileName);
                BufferedReader rd = new BufferedReader(new InputStreamReader(fis));

                while ((s = rd.readLine()) != null) {
                    out += s + " ";
                }

                rd.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            getFileContent();

        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
}