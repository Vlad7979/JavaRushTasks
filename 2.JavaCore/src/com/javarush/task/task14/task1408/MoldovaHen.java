package com.javarush.task.task14.task1408;

class MoldovanHen extends Hen {

    String country = Country.MOLDOVA;
    int N = 25;

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