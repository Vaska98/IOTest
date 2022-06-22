package com.wxy.prient_;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author wuxinyou
 * @create 2022/5/26
 */
public class PrintStream_ {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = System.out;
        out.print("john,吴新友");
        out.close();
        //默认输出是标准输出，修改System类的out属性，就可以改变输出位置
        System.setOut(new PrintStream("D:\\DevData\\ioTempData\\print.txt"));
        System.out.println("测试打印流输出位置");//会自动生成文件，并将内容打印到文件中
    }
}
