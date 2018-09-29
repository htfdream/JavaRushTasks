package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    int CountOfEggsPerMonth = 10;
    String country  = "Украина";
    public int getCountOfEggsPerMonth(){return CountOfEggsPerMonth;}
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + CountOfEggsPerMonth + " яиц в месяц.";
    }
}
