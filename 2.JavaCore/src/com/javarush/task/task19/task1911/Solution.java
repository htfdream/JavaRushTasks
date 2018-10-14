package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream old = System.out;
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(bao);
        System.setOut(stream);

        testString.printSomething();
        String result = bao.toString().toUpperCase();

        System.setOut(old);
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
