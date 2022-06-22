package com.wxy.outputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author wuxinyou
 * @create 2022/5/25
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception{
        //序列化后保存的文件格式不是纯文本的，而是按照他的格式来保存的
        String filePath = "D:\\DevData\\ioTempData\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到filePath中
        oos.writeInt(100);//int=>Integer(实现了Serializable)
        oos.writeBoolean(true);//boolean=>Boolean(实现了Serializable)
        //......
        //保存一个dog对象
        oos.writeObject(new Dog("旺财",3));

        oos.close();
        System.out.println("序列化数据完毕");
    }
}

