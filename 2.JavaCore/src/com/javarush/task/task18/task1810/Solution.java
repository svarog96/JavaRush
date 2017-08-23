package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            FileInputStream inStream = new FileInputStream(reader.readLine());
            if(inStream.available() < 1000){
                inStream.close();
                throw new DownloadException();
            }
            inStream.close();
        }

    }

    public static class DownloadException extends Exception {

    }
}
