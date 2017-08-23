package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> byteCollection = new TreeSet<>();
        FileInputStream inStream = new FileInputStream(reader.readLine());

        while (inStream.available() > 0){
            byteCollection.add(inStream.read());
        }

        for (Integer i : byteCollection) {
            System.out.print(" " + i);
        }
        inStream.close();
    }
}
