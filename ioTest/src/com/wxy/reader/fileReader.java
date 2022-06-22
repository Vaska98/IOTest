package com.wxy.reader;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wuxinyou
 * @create 2022/5/23
 */
public class fileReader {
    public static void main(String[] args) {

    }
    @Test
    public void file(){
        String filePath = "D:\\DevData\\ioTempData\\story.txt";
        FileReader fileReader = null;
        int readData = 0;
        try {
            fileReader = new FileReader(filePath);
            while ((readData = fileReader.read()) != -1){
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void file1(){
        String filePath = "D:\\DevData\\ioTempData\\story.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf= new char[8];
        try {
            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
