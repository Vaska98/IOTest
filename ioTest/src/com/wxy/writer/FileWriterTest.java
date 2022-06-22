package com.wxy.writer;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wuxinyou
 * @create 2022/5/23
 */
public class FileWriterTest {
    public static void main(String[] args) {

    }
    @Test
    public void writer(){
        String filePath = "D:\\DevData\\ioTempData\\writer.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
//            fileWriter.write('H');
//            fileWriter.write(chars);
//            fileWriter.write("吴新友最帅，没意见吧".toCharArray(),0,8);
//            fileWriter.write("吴新友最帅，没意见吧");
            fileWriter.write("吴新友最帅，没意见吧".toCharArray(),0,2);
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
