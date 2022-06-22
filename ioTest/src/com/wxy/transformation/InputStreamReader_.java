package com.wxy.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author wuxinyou
 * @create 2022/5/26
 */
public class InputStreamReader_ {
    public static void main (String[] args) throws Exception{
        String filePath = "D:\\DevData\\ioTempData\\fashionANSI.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        System.out.println("读取内容=" + str);
        br.close();
    }
}
