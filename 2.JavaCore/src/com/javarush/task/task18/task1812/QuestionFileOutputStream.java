package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private AmigoOutputStream amigoOutputStream;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream){
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        this.amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        this.amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        this.amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String str = reader.readLine();

        if(str.toUpperCase().equals("Д")){
           amigoOutputStream.close();
        }
    }

}

