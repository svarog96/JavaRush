package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileInputStream inStream = new FileInputStream(name1);
        FileOutputStream outStream = new FileOutputStream(name2);

        byte[] buffer = new byte[inStream.available()];
        byte[] reversBuffer = new byte[inStream.available()];
        inStream.read(buffer);

        for (int i = 0; i < buffer.length; i++) {
            reversBuffer[reversBuffer.length-1-i] = buffer[i];
        }

        outStream.write(reversBuffer, 0, reversBuffer.length);

        inStream.close();
        outStream.close();
    }
}
