package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        this.name = name;
        this.age = 10;
        this.weight = 10;
        this.color = "Red";

    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Red";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "Red";
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 10;
    }
    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 10;
    }

    public static void main(String[] args) {

    }
}
