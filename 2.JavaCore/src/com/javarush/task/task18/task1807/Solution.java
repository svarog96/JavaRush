package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(reader.readLine());
        int count = 0;

        while (inStream.available() > 0){
            if(inStream.read() == 44)
                count++;
        }
        System.out.println(count);
        inStream.close();
    }
}
