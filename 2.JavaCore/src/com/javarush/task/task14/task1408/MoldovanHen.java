package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    int CountOfEggsPerMonth = 3;
    String country  = "Молдовия";
    public int getCountOfEggsPerMonth(){return CountOfEggsPerMonth;}
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + CountOfEggsPerMonth + " яиц в месяц.";
    }
}
