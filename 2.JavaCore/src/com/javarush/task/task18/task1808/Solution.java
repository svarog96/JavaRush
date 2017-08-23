package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        FileInputStream inStream = new FileInputStream(name1);
        FileOutputStream outStream1 = new FileOutputStream(name2);
        FileOutputStream outStream2 = new FileOutputStream(name3);

        byte[] buffer = new byte[inStream.available()];

        while(inStream.available()>0){
            int count = inStream.read(buffer);
            System.out.println(count/2);

            if(buffer.length%2 == 0){
                outStream1.write(buffer, 0, count/2);
                outStream2.write(buffer, count/2, count/2);
            }
            else{
                outStream1.write(buffer, 0, count/2+1);
                outStream2.write(buffer, count/2+1, count/2);
            }
        }
        inStream.close();
        outStream1.close();
        outStream2.close();
    }
}
