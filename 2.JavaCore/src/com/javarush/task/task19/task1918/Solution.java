package com.javarush.task.task19.task1918;

/*
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(fileName.readLine()));
        //FileReader reader = new FileReader(fileName.readLine());
        fileName.close();
        String string = "";
        while (reader.ready()){
            string = string + reader.readLine();
        }
        reader.close();
        Document document = Jsoup.parse(string,  "", Parser.xmlParser());
        Elements elements = document.select(args[0]);
        for (Element x : elements){
            System.out.println(x);
        }
    }
}