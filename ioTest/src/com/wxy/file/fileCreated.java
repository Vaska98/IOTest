package com.wxy.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author wuxinyou
 * @create 2022/5/22
 */
public class fileCreated {
    public static void main(String[] args) {

    }
    @Test
    public void create01(){
        File file = new File("D:\\DevData\\ioTempData\\fashion1Bak.txt");
        try {
            file.createNewFile();
            System.out.println("文件新建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create02(){
        File parentFile = new File("D:\\DevData\\ioTempData");
        String fileName = "fashion2bak.txt";
        File file = new File(parentFile,fileName);

        try {
            file.createNewFile();
            System.out.println("文件已经创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void create3(){
        String parentPath = "D:\\DevData\\ioTempData";
        String fileName = "fashion3.txt";
        File file = new File(parentPath,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
