package com.wxy.prient_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wuxinyou
 * @create 2022/5/26
 */
public class printWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.print("你好呀");
        printWriter.close();

        //重定向输出位置
        PrintWriter printWriter1 = new PrintWriter(new FileWriter("D:\\DevData\\ioTempData\\printWriter.txt"));
        printWriter1.print("测试打印位置");
        printWriter1.close();
    }
}
