package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        BigInteger f = BigInteger.ONE;
        BigInteger i = BigInteger.ONE;
        BigInteger nn = new BigInteger(String.valueOf(n));

        if (nn.compareTo(BigInteger.ZERO) < 0 )
            f = BigInteger.ZERO;
        else {
            for (;true;) {
                if (i.compareTo(nn) <= 0) {
                    f = f.multiply(i);
                    i = i.add(BigInteger.ONE);
                }
                else
                    break;
            }
        }
        return String.valueOf(f);
    }
}
