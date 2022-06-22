package com.wxy.reader;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wuxinyou
 * @create 2022/5/24
 */
public class BufferedReader_ {
    public static void main(String[] args) {

    }
    @Test
    public void bufferedRead() throws IOException {
        String filePath = "D:\\DevData\\ioTempData\\story.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = bufferedReader.readLine()) !=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
