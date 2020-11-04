package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    String country = Country.BELARUS;
    int N = 30;

    @Override
    public int getCountOfEggsPerMonth() {

        return N;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}