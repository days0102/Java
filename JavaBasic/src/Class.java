/*
 * @Author: Outsider
 * @Date: 2021-10-21 19:45:17
 * @LastEditors: Outsider
 * @LastEditTime: 2021-10-30 21:05:34
 * @Description: In User Settings Edit
 * @FilePath: \Java\JavaBasic\src\Class.java
 */
import java.time.*;
import java.util.Date;

public class Class {
    public static void main(String[] arg)
    {
        Date time=new Date();//java中创建对象时要使用new
        System.out.println(time);//打印当前时间

        //# 对象和对象变量
        Date date;//定义一个对象变量，可以引用Date类型的对象
        //! date不是一个对象，也没有引用任何变量

        date=time;//两个变量引用同一个变量

        //! 对象变量并没有实际包含一个对象，他只是引用一个对象
        //! 任何对象变量的值都是对存储在另一个地方的某个对象的引用

        //java中构造器构造对象要使用new
        Employee staff=new Employee("Mike", 15000, 2021, 10, 30,20);//#所有的java对象都是在堆中构造
        var person=new Employee(20);//#使用var自动推导类型
        String name=staff.getName();
        System.out.println(name);
        System.out.println(person.getSalary());
    }
}

//!文件名必须与public类的名字相匹配。在一个文件中只能有一个public类，但可以有任意个非public类
// !编译时会创建每个类的class文件

//自定义类
class Employee{
    private String name="";//在类定义中可以直接初始化，其在构造器之前执行该赋值操作
    private double salary;
    private LocalDate hireDay;
    private final int age;//final实例字段必须在构造是初始化
    private static int num=0;//静态字段，属于类而不属于某个对象
    public static final double rate=0.6;//静态常量

    //构造器，总是结合new来使用
    public Employee(String n,double s,int year,int month,int day,int a)
    {
        name=n;
        salary=s;
        hireDay=LocalDate.of(year, month, day);
        age=a;
    }
    //#调用另一个构造器
    public Employee(int aAge)
    {
        this("null",10000,2020,10,30,aAge);
    }
    //#初始化块
    {
        salary=20000;//@无论使用那个构造器都会先运行初始化块，才运行构造器的主体部分
    }

    public String getName()
    {
        return name; 
    }
    public double getSalary()
    {
        return salary;
    }
    public LocalDate getHireDay()
    {
        return hireDay;
    }
    public int getAge()
    {
        return age;
    }
}