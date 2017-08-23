package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(reader.readLine());
        int currentByte;
        int minByte = inStream.read();

        while(inStream.available() > 0){
            currentByte = inStream.read();
            if(currentByte < minByte)
                minByte = currentByte;
        }
        System.out.println(minByte);
        inStream.close();
    }
}
