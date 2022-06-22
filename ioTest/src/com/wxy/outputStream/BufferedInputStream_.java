package com.wxy.outputStream;

import java.io.*;

/**
 * @author wuxinyou
 * @create 2022/5/24
 */
public class BufferedInputStream_ {
    public static void main(String[] args) {
        String srcFilePath = "D:\\DevData\\ioTempData\\outputStreamWrite.jpg";
        String destFilePath = "D:\\DevData\\ioTempData\\bufferCopy.jpg";
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        byte[] buf = new byte[1024];
        int readLen = 0;
        try {
            //FileInputStream 是 InputStream 的子类
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
            //循环读取二进制文件,-1时文件读取完毕
            while ((readLen = bufferedInputStream.read(buf)) != -1){
                bufferedOutputStream.write(buf,0,readLen);
            }
            System.out.println("拷贝完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
