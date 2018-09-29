package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    int CountOfEggsPerMonth = 1;
    String country  = "Беларусь";
    public int getCountOfEggsPerMonth(){return CountOfEggsPerMonth;}
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + CountOfEggsPerMonth + " яиц в месяц.";
    }
}
