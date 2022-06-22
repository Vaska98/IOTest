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
public class fileCopy {
    public static void main(String[] args) {

    }
    @Test
    public void copy(){
        String srcFilePath = "D:\\DevData\\中文-左上.jpg";
        String desFilePath = "D:\\DevData\\ioTempData\\outputStreamWrite.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            byte[] buf = new byte[1024];
            int readLen = 0;
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(desFilePath);
            while ((readLen = fileInputStream.read(buf)) != -1){
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
