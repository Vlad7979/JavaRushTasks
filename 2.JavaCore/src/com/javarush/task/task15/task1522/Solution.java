package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = bufferedReader.readLine().trim();
            switch (string) {
                case Planet.EARTH:
                    thePlanet = Earth.getInstance();
                    break;
                case Planet.MOON:
                    thePlanet = Moon.getInstance();
                    break;
                case Planet.SUN:
                    thePlanet = Sun.getInstance();
                    System.out.println(Sun.getInstance().getClass());
                    break;
                default:
                    thePlanet = null;
            }
        } catch (Exception e) {
            System.out.println("Exception occur when there is non-planet string");
        }
    }
}