package com.wxy.outputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wuxinyou
 * @create 2022/5/23
 */
public class fileOutputStream {
    public static void main(String[] args) {

    }

    /**
     * 文件不存在，则先创建文件
     */
    @Test
    public void writeFile(){
        String filePath = "D:\\DevData\\ioTempData\\outputStreamTest.txt";
        //创建FileOutputStream对象
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath,true);//第二个参数append不写的话会覆盖文件，写ture表示在后面追加
            //方法一：写入一个字节
            fileOutputStream.write('H');
            String str = "hello world!";
            //方法二：写入多个字节，str.getBytes()将字符串转换成字节数组
            fileOutputStream.write(str.getBytes());
            //方法三：控制写入字节的数量
            fileOutputStream.write(str.getBytes(),0,str.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
