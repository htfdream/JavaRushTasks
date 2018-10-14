package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/


import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fo = new FileOutputStream(buf.readLine());
        buf.close();
        PrintStream old = System.out;
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bao);
        System.setOut(ps);
        testString.printSomething();

        fo.write(bao.toString().getBytes());
        fo.close();
        System.setOut(old);
        System.out.println(bao.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

