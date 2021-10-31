/*
 * @Author: Outsider
 * @Date: 2021-10-30 20:40:19
 * @LastEditors: Outsider
 * @LastEditTime: 2021-10-31 20:42:30
 * @Description: In User Settings Edit
 * @FilePath: \Java\JavaBasic\src\Inheritance.java
 */

public class Inheritance {
    public static void main(String []arg)
    {
        var manage=new Manager("Lin", 20000, 20);
        var name=manage.getName();
        System.out.println(name);
        Employee employee=manage;
        System.out.println(employee.getSalary());
        var staff=new Employee("Tom", 18000, 2021, 10, 31, 20);
        if(staff instanceof Manager)//使用instanceof检查是否能够转换成功
        {
            manage=(Manager)staff;
            System.out.println("转换成功");
        }
    }
    
}
/*
 * @Author: Outsider
 * @Date: 2021-10-30 20:40:19
 * @LastEditors: Outsider
 * @LastEditTime: 2021-10-31 20:29:57
 * @Description: In User Settings Edit
 * @FilePath: \Java\JavaBasic\src\Inheritance.java
 */

 //#java中所有继承都是public继承
 class Manager extends Employee{ //@extends表示继承
    


    public Manager(String aName,double aSalary,int aAge)
    {
        super(aName,aSalary,2021,10,30,aAge);//使用supper调用构造器必须是子类构造器的第一条语句
        System.out.println("Init");
    }
    
    public double getSalary()
    {
        return super.getSalary()+2000;
    }
 }


final class testfinal{//#final修饰的类不能被继承
    private int num;//#被final修饰的类的字段不是final

    public int getNum(){//#被final修饰的类的方法自动成为final
        return num;
    }
}
