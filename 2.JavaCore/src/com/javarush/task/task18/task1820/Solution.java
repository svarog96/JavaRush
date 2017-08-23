package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inStream = new FileInputStream(file1);
        FileOutputStream outStream = new FileOutputStream(file2);

        byte[] buffer = new byte[inStream.available()];
        inStream.read(buffer);
        String[] str = new String(buffer, "UTF-8").split(" ");


        for(int i = 0; i < str.length; i++){
            outStream.write(32);
            outStream.write(String.valueOf((int)Math.round(Double.parseDouble(str[i]))).getBytes());

        }

        inStream.close();
        outStream.close();
    }
}
