package com.wxy.properties;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author wuxinyou
 * @create 2022/5/26
 */
public class properties02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("D:\\DevData\\ioTempData\\mysqlProperties.txt"));
        properties.list(System.out);
        String user = properties.getProperty("user");
        String psw = properties.getProperty("psw");
        System.out.println("用户名" + user);
        System.out.println("密码" + psw);
    }
    @Test
    public void test01() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("charset","utf-8");
        properties.setProperty("user","吴新友");//保存的时中文的unicode码
        properties.setProperty("psw","123456");
        properties.store(new FileOutputStream("D:\\DevData\\ioTempData\\test.txt"),null);//null表示注释
    }
}
