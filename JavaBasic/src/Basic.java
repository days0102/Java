import java.sql.SQLOutput;
import java.util.Scanner;

public class Basic {
    /* 这种方法注释不能嵌套 */
    // java中的main方法必须是静态的
    public static void main(String[] args)// main函数没有给系统返回“退出代码”，正常退出代码为0
    // 如果希望在终止程序时返回其他代码，需要调用System.exit方法
    {
        System.out.println("Hello");// println打印并换行，print打印不换行
        System.out.println(2 - 1.1);
        /*
         * 没有打印0.9，因为浮点数值采用二进制系统表示， 而二进制系统中无法精确表示1/10， 就好像十进制无法精确表示1/3
         */
        System.out.println('\u03C0');// Unicode编码\u03C0表示希腊字母π
        System.out.println('\u2122');// 输出注册符号™
        int a;// 变量使用前必须初始化
        System.out.println(Math.sin(2));

        // 读取输入
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();// 不以空格符作为分隔符（结束符）
        System.out.println(name);
        name = in.next();// 以空格符作为分隔符（结束符）
        System.out.println(name);
        int num = in.nextInt();// 读取整数
        System.out.println(num);
    }

    public void dataType() {
        // java没有任何无符号类型
        // 整形（数据范围于机器无关）
        int a = 1; // 4字节
        short b = 2; // 2字节
        long c = 3; // 8字节
        byte d = 4; // 1字节

        // 浮点类型
        float e = 2.1f; // 4字节,赋值是要有后缀F(f),没有后缀的浮点值(如2.1)默认为double类型
        double f = 2.1; // 8字节

        // boolean类型:false和true,整数值和不二值之间不能进行转换
        boolean check = true;

        // 推断类型
        var num = 1000;
        System.out.println(num);

    }

    // 变量
    public void type() {
        // 变量的命名没有长度限制
        // Box box;
        // Box aBox

        // 常量(关键字final)
        final double PI = 3.1415926;
        // pi=3.14;//错误

    }
    // 类常量

    // 类常量定义在main方法的外部
    static final double ee = 1.222;// 在同一个类中的其他方法也可以使用该常量
    public static final double eee = 1.223;// 声明位public，其他类的方法也可以使用

    // 正无穷大Double.POSITIVE_INFINITY
    // 负无穷大Double.NEGATIVE_INFINITY
    // 非数值Double.NaN


    

}
