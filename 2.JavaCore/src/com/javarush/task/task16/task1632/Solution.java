package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new OneThread());
        threads.add(new TwoThread());
        threads.add(new ThreeThread());
        threads.add(new FourThread());
        threads.add(new FiveThread());
    }

    public static void main(String[] args) {
    }

    public static class OneThread extends Thread {

        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }
    }

    public static class TwoThread extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                    break;
                }
            }
        }
    }

    public static class ThreeThread extends Thread {

        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public static class FourThread extends Thread implements Message{

        @Override
        public void showWarning() {
            if (this.isAlive()) this.interrupt();
        }

        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }
    }

    public static class FiveThread extends Thread {

        @Override
        public void run() {
            int sum = 0;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                while (!isInterrupted()) {
                    String line = br.readLine();
                    if (line.equals("N")) {
                        this.interrupt();
                    } else {
                        int integer = Integer.parseInt(line);
                        sum += integer;
                    }
                }

                throw new InterruptedException();

            } catch (InterruptedException e) {
                System.out.println(sum);

            } catch (IOException ex) {
            }
        }
    }
}