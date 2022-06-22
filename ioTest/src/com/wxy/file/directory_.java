package com.wxy.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author wuxinyou
 * @create 2022/5/23
 */
public class directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        File file = new File("d:\\DevData\\ioTempData\\fashion2");
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
    @Test
    public void m2(){
        File file = new File("D:\\DevData\\ioTempData\\demo");
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
    @Test
    public void m3(){
        File file = new File("D:\\DevData\\ioTempData\\demo\\a\\b");
        if (file.exists()){
            System.out.println("该目录已经存在");
        }else {
            if (file.mkdirs()) {
                System.out.println("目录创建成功");
            }else {
                System.out.println("创建失败");
            }
        }
    }
}
