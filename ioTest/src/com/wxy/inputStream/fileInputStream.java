package com.wxy.inputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wuxinyou
 * @create 2022/5/23
 */
public class fileInputStream {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath = "D:\\DevData\\ioTempData\\fashion3.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建fileInputStream对象
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read()) != -1){
                System.out.print((char)readData);
            };
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readFile02(){
        String filePath = "D:\\DevData\\ioTempData\\fashion3.txt";
        int readData = 0;
        byte[] buf = new byte[8];
        FileInputStream fileInputStream = null;
        try {
            //创建fileInputStream对象
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read(buf)) != -1){
                System.out.print(new String(buf,0,readData));
            };
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
