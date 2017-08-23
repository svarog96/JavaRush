package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream inStream2 = new FileInputStream(file2);
        FileInputStream inStream3 = new FileInputStream(file3);

        FileOutputStream outStream1 = new FileOutputStream(file1, true);

        while (inStream2.available() > 0){
            int data = inStream2.read();
            outStream1.write(data);
        }
        while (inStream3.available() > 0){
            int data = inStream3.read();
            outStream1.write(data);
        }

        outStream1.close();
        inStream2.close();
        inStream3.close();
    }
}
