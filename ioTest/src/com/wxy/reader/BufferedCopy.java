package com.wxy.reader;

import com.wxy.writer.BufferedWriter_;

import java.io.*;

/**
 * @author wuxinyou
 * @create 2022/5/24
 */
public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "D:\\DevData\\ioTempData\\fashion3.txt";
        String descFilePath = "D:\\DevData\\ioTempData\\fashion3Bak.txt";
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(descFilePath));
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

}
