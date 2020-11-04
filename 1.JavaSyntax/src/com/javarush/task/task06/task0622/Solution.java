/*
package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

*/
/*
Числа по возрастанию
*//*


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();

        int a1 = Integer.parseInt(reader.readLine());
        arrayList.add(a1);
        int a2 = Integer.parseInt(reader.readLine());
        arrayList.add(a2);
        int a3 = Integer.parseInt(reader.readLine());
        arrayList.add(a3);
        int a4 = Integer.parseInt(reader.readLine());
        arrayList.add(a4);
        int a5 = Integer.parseInt(reader.readLine());
        arrayList.add(a5);

        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
*/
