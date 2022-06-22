package com.wxy;

/**
 * @author wuxinyou
 * @create 2022/5/28
 */
public class IntegerTest {
    public static void main(String[] args) {
        double price = 14.25;
        int fee = 0;
        //得到价格，传过来的值*100；
        if (0 != price) {
            fee = (int)price;
        }
        System.out.println(fee);
    }
}
