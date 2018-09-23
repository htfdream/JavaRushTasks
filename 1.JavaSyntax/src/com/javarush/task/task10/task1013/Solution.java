package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private int height;
        private int weight;
        private int salary;

        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }
        public Human(String name, int age, boolean sex, int height, int weight){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }
        public Human(String name, int height, int weight){
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
        public Human(String name, boolean sex, int height, int weight){
            this.name = name;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }
        public Human(int salary){
            this.name = "NA";
            this.salary = salary;
        }
        public Human(String name, boolean sex, int salary){
            this.name = name;
            this.sex = sex;
            this.salary = salary;
        }
        public Human(String name, int age, boolean sex, int salary){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.salary = salary;
        }
        public Human(String name, int age, boolean sex, int height, int weight, int salary){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.salary = salary;
        }
    }
}
