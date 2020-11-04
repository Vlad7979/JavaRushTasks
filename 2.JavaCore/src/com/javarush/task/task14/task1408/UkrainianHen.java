package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    String country = Country.UKRAINE;
    int N = 32;

    @Override
    public int getCountOfEggsPerMonth() {

        return N;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " +
                country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}