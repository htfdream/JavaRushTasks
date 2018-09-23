package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human s1 = new Human();
        s1.name = "s1";
        s1.age = 12;
        s1.sex = true;
        Human s2 = new Human();
        s2.name = "s2";
        s2.age = 14;
        s2.sex = true;
        Human d1 = new Human();
        d1.name = "d1";
        d1.age = 18;
        d1.sex = false;
        Human f1 = new Human();
        f1.name = "f1";
        f1.age = 40;
        f1.sex = true;
        f1.children.add(s1);
        f1.children.add(s2);
        f1.children.add(d1);
        Human m1 = new Human();
        m1.name = "m1";
        m1.age = 27;
        m1.sex = false;
        m1.children.add(s1);
        m1.children.add(s2);
        m1.children.add(d1);
        Human g1 = new Human();
        g1.name = "d1";
        g1.sex = true;
        g1.age = 65;
        g1.children.add(f1);
        Human gm1 = new Human();
        gm1.name = "gm1";
        gm1.age = 65;
        gm1.sex = false;
        gm1.children.add(f1);
        Human g2 = new Human();
        g2.name = "g2";
        g2.sex = true;
        g2.age = 56;
        g2.children.add(m1);
        Human gm2 = new Human();
        gm2.name = "gm2";
        gm2.age = 56;
        gm2.sex = false;
        gm2.children.add(m1);

        System.out.println(g1);
        System.out.println(gm1);
        System.out.println(g2);
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
        ArrayList<Human> children = new ArrayList<Human>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
