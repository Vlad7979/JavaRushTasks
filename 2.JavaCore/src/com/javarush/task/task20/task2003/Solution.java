package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> runtimeStorage = new HashMap<>();


    public void fillInPropertiesMap() throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(consoleReader.readLine());

        Properties propertiesProp = new Properties();
        propertiesProp.load(reader);
        for (String temp : propertiesProp.stringPropertyNames()) {
            runtimeStorage.put(temp, propertiesProp.getProperty(temp));
        }
        consoleReader.close();
        reader.close();


    }

    public void save(OutputStream outputStream) throws Exception {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream));
        for (Map.Entry<String, String> pair : runtimeStorage.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(pair.getKey());
            sb.append("=");
            sb.append(pair.getValue());
            writer.println(sb.toString());
            writer.flush();
        }
        writer.close();

    }

    public void load(InputStream inputStream) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String pair;
        while ((pair = reader.readLine()) != null) {
            runtimeStorage.put(pair.split("=")[0], pair.split("=")[1]);
        }
        reader.close();
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();


    }
}