package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = new FileInputStream(args[0]);
        int total = 0;
        int spaces = 0;

        while (inStream.available() > 0){
            total++;
            if(inStream.read() == 32)
                spaces++;
        }
        System.out.printf("%.2f",((float)(spaces)/total)*100);

        inStream.close();
    }
}
