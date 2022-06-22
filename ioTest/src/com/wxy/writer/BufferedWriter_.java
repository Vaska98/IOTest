package com.wxy.writer;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wuxinyou
 * @create 2022/5/24
 */
public class BufferedWriter_ {
    public static void main(String[] args) {

    }
    @Test
    public void bufferWrite() throws IOException {
        String filePath = "D:\\DevData\\ioTempData\\bufferedWriter.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello1 ,吴新友！");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.write("hello2 ,吴新友！");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3 ,吴新友！");
        bufferedWriter.close();
    }

}
