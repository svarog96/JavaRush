package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Character, Integer> symbols = new TreeMap<>();

        String param = args[0];
        FileInputStream inStream = new FileInputStream(param);


        while(inStream.available() > 0){
            int data = inStream.read();

            if(symbols.containsKey((char)data)){
                symbols.put((char)data, (symbols.get((char)data)+1));
            }
            else {
                symbols.put((char)data, 1);
            }
        }

        for (Map.Entry<Character, Integer> pair: symbols.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
       inStream.close();
    }
}
