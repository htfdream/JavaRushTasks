package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream old = System.out;
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bao);
        System.setOut(ps);
        testString.printSomething();
        System.setOut(old);
        String s = bao.toString();
        s = s.replaceAll("\\n", "");
        String[] d = s.split("\\b");
        int a = Integer.parseInt(d[0]);
        int b = Integer.parseInt(d[2]);
        char c = d[1].charAt(1);
        int result;
        if (c == '+')
            result = a + b;
        else if (c == '*')
            result = a * b;
        else
            result = a - b;
        System.out.println(s+result);



        //System.out.println(""+a+c+b);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

