import java.util.Arrays;

/*
 * @Author: Outsider
 * @Date: 2021-10-24 15:38:41
 * @LastEditors: Outsider
 * @LastEditTime: 2021-10-24 16:57:25
 * @Description: In User Settings Edit
 * @FilePath: \Java\JavaBasic\src\ProcessControl.java
 */


public class ProcessControl {
    //#流程控制
    public static void main(String[] arg)
    {
        //# swith语句，与C++一致
        /**
         * case标签可以为：
         * 1.常量表达式char,byte,short,int类型
         * 2.枚举常量
         * 3.Java7开始，可以为字符串字面量
         */

        //# for each 循环 
        /**for(variable:collection)statement
         * @description: 语句的循环变量会遍历数组中的每个元素，而不是下标
         * @param {collection为一个数组或一个实现了Iterable接口的类对象}
         * @return {*}
         *
        */
        int[] arr=new int[10];
        for(int element:arr)//! 不能对基本类型循环变量赋值
        {
            element=5;//? 并不会改变数组元素的值
            //! 基本类型不会改变，引用会改变值
        }
        for(int element:arr)
        {
            System.out.println(element);
        }

        //# 数组拷贝
        int[] arrcopy=arr;//!两个变量引用同一个副本
        arrcopy[1]=10;
        System.out.println(arrcopy[1]);//! 修改一个两个同时变
        
        //创建新的数组
        int[] copy=Arrays.copyOf(arr, arr.length);
        copy[2]=1;
        System.out.println(arr[2]);
        
    }
    
}
