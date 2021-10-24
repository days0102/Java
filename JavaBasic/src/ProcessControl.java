/*
 * @Author: Outsider
 * @Date: 2021-10-24 15:38:41
 * @LastEditors: Outsider
 * @LastEditTime: 2021-10-24 16:36:37
 * @Description: In User Settings Edit
 * @FilePath: \JavaBasic\src\ProcessControl.java
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
        
    }
    
}
