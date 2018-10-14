package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bao);
        PrintStream old = System.out;
        System.setOut(ps);
        testString.printSomething();
        String s="";
        int n = 0;
        for (char c : bao.toString().toCharArray()
             ) {
            s+=c;
            if (c =='\n') n++;
            if (n == 2){
                s+= "JavaRush - курсы Java онлайн" + "\n";
                n = 0;
            }

        }
        System.setOut(old);
        System.out.println(s);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
