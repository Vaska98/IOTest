package com.wxy.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wuxinyou
 * @create 2022/5/26
 */
public class test {
    public static void main(String[] args) throws Exception{
            String filePath = "D:\\DevData\\ioTempData\\mysqlProperties.txt";
            BufferedReader bufferedWriter = new BufferedReader(new FileReader(filePath));
            String line = null;
            while ((line = bufferedWriter.readLine()) != null){
                String[] split = line.split("=");
                System.out.println(split[0]);
            }
            bufferedWriter.close();
        }
}
