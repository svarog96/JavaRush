package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inStream1 = new FileInputStream(file1);
        FileInputStream inStream2 = new FileInputStream(file2);


        byte[] buffer1 = new byte[inStream1.available()];
        inStream1.read(buffer1);

        FileOutputStream outStream1 = new FileOutputStream(file1);

        while (inStream2.available() > 0){
            int data = inStream2.read();
            outStream1.write(data);
        }
        outStream1.close();

        FileOutputStream outStream12 = new FileOutputStream(file1, true);
        outStream12.write(buffer1);

        inStream1.close();
        inStream2.close();
        outStream12.close();


    }
}
