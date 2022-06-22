package com.wxy.inputStream;

import com.wxy.outputStream.Dog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 * @author wuxinyou
 * @create 2022/5/25
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\DevData\\ioTempData\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取，反序列化顺序需要和和序列化顺序保持一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        Object dog = ois.readObject();
        System.out.println(dog);
        System.out.println(dog.getClass());
        Dog dog1 = (Dog)dog;
        System.out.println(dog1.getName());

    }
}
