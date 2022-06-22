package com.wxy.transformation;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * @author wuxinyou
 * @create 2022/5/26
 */
public class outputStreamWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath = "D:\\DevData\\ioTempData\\transformationANSI.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),"utf-8");
        osw.write("吴新友");
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("可以NSA电话");
        bw.close();
    }
}
