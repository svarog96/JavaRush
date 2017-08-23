package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = new FileInputStream(args[0]);
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        int count = 0;

        while (inStream.available()>0){

            Matcher matcher = pattern.matcher(Character.toString((char) inStream.read()));
            count += matcher.matches()? 1 : 0;
        }
        inStream.close();
        System.out.println(count);
    }

}
