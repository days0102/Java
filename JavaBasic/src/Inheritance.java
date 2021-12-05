import java.util.ArrayList;

/*
 * @Author: Outsider
 * @Date: 2021-10-30 20:40:19
 * @LastEditors: Outsider
 * @LastEditTime: 2021-11-23 23:50:03
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
        if(staff instanceof Manager)//#使用instanceof检查是否能够转换成功
        {
            System.out.println("可以成功");
        }
        //equals方法
        System.out.println(manage.equals(staff));
        //getClass方法返回一个对象所属的类
        System.out.println(staff.getClass());
        //toString返回表示对象值的一个字符串
        System.out.println(staff.toString());
        System.out.println(""+staff);//与调用toString()一样
        System.out.println(staff);//会调用toString()方法


        //泛型数组
        ArrayList<Employee> staff_list=new ArrayList<>();
        //ArrayList<Employee> staff_list=new ArrayList<Employee>();
        //var staff_list=new ArrayList<Employee>();
        var stl=new ArrayList<>();//如果没指定泛型类型默认为Object

        //添加对象到泛型数组
        staff_list.add(staff);
        //返回数组元素个数size()
        System.out.println(staff_list.size());
        //获取数组元素
        System.out.print(staff_list.get(0));//获取下标为0的元素
        //设置数组元素set()
        staff_list.set(0, staff);//set()只能用于修改数组元素，而不能增加元素（index不能大于等于数组长度）
        //删除元素
        staff_list.remove(0);//删除下标为0的元素
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

    //!private的内容对其他类都是不可见的，即使子类也不能访问
    private int num;//#被final修饰的类的字段不是final

    public int getNum(){//#被final修饰的类的方法自动成为final
        return num;
    }
}
