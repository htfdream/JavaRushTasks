package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] address = new byte[4];
        for (int i = 0; i < 4; i++) {
            address[i] =(byte)( (int)ip[i] & (int)mask[i]);
        }
        return address;
    }

    public static void print(byte[] bytes) {
        for (int i = 0; i < 4; i++) {
            String n = "";
            int j;
            if (bytes[i] < 0){
            j = bytes[i]+256;}
            else{j = bytes[i];}

            while (j > 0) {
                int t = j%2;
                j = j/2;
                n = t + n;

            }
            if (n.equals("")) n = "0";
            System.out.print(String.format("%08d", Integer.parseInt(n)) + " ");

        }
        System.out.println("");
    }
}
