package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {
      /*  Beach beach_waikiki = new Beach("waikiki", 3, 5);
        Beach beach_banana = new Beach("banana", 1, 1);
        Beach beach_palm = new Beach("palm", 10, 10);
        System.out.println(beach_waikiki.compareTo(beach_banana));
        System.out.println(beach_waikiki.compareTo(beach_palm));
        System.out.println(beach_banana.compareTo(beach_waikiki));*/

    }

    @Override
    public synchronized int compareTo(Beach o) {
        return this.quality - (int)(this.distance) + (int)o.distance - o.quality;
    }
}