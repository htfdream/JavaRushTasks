package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{
    int CountOfEggsPerMonth = 5;
    String country  = "Россия";
    public int getCountOfEggsPerMonth(){return CountOfEggsPerMonth;}
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + CountOfEggsPerMonth + " яиц в месяц.";
    }
}
