package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human gf1 = new Human("gf1", true, 80);
        Human gf2 = new Human("gf2", true, 76);
        Human gm1 = new Human("gm1", false, 80);
        Human gm2 = new Human("gm2", false, 56);

        Human f1 = new Human("f1", true, 48, gf1, gm1);
        Human m1 = new Human("m1", false,35, gf2, gm2);
        Human s1 = new Human("s1", true, 21, f1, m1);
        Human s2 = new Human("s2", true, 12, f1, m1);
        Human d1 = new Human("d1", false, 24, f1,m1);

        System.out.println(gf1);
        System.out.println(gm1);
        System.out.println(gf2);
        System.out.println(gm2);
        System.out.println(f1);
        System.out.println(m1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(d1);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
    }
}






















