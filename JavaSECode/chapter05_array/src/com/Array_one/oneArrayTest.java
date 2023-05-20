package com.Array_one;

/**
 * ClassName: oneArrayTest
 * Package: com.Array_one
 * Description:
 *
 * @Author Null_jun
 * @Create 2023/5/20 17:11
 * @Version 1.0
 */
public class oneArrayTest {
    public static void main(String[] args) {
        // 1、数组的声明与初始化
        // 方式一;静态初始化,数组变量的赋值与数组元素的赋值操作同时进行。
        double[] prices = new double[]{11.22, 22.333};
        String[] foods = new String[]{"龙须面", "海参"};
        // 方式二
        String[] foods_many = new String[4];

        //其它正确的方式
        int arr[] = new int[4];
        int[] arr1 = {1,2,3,4}; //类型推断

        System.out.println(prices);
        System.out.println(foods);
        System.out.println(foods_many);
    }
}
