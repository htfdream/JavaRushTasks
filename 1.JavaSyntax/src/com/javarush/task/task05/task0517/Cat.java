package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
        this.name = name;
        this.age = 10;
        this.color = "Red";
        this.weight = 10;
    }

    public  Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Red";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "Red";
        this.weight = 10;
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 10;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.age = 10;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
