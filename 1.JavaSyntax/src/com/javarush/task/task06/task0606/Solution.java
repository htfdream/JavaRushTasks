package com.javarush.task.task06.task0606;

import java.awt.image.ShortLookupTable;
import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        int l = s.length();
        int n = Integer.parseInt(s);
        for (int i = 0; i < l; i++) {
            if ((n/(int)Math.pow(10, i)) % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + " "+ "Odd: " + odd);
    }
}
