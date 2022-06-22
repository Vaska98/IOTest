package com.wxy.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author wuxinyou
 * @create 2022/5/23
 */
public class fileInformation {
    public static void main(String[] args) {

    }

    @Test
    public void info(){
        File file = new File("D:\\DevData\\ioTempData");
        System.out.println("文件名："+file.getName());
        System.out.println("文件绝对路径"+file.getAbsolutePath());
        System.out.println("文件大小"+file.length());
        System.out.println("文件父级路径"+file.getParent());
        System.out.println("文件是否村存在"+file.exists());
        System.out.println("是否是文件"+file.isFile());
        System.out.println("是都是目录"+file.isDirectory());

    }
}
