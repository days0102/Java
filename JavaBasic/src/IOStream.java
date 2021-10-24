/*
 * @Author: Outsider 
 * @Date: 2021-10-24 15:42:13 
 * @Last Modified by:   Outsider 
 * @Last Modified time: 2021-10-24 15:42:13 
 */
 
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;//Scanner类定义在java.util包中



public class IOStream {
    public static void main(String[] args) throws IOException {
        // // 首先要构造一个与System.in关联的Scanner对象
        // Scanner in = new Scanner(System.in);
        // String name = in.nextLine();// 可读取空格
        // System.out.println(name);
        // String str = in.next();// 空格为结束符
        // System.out.println(str);
        // int a = in.nextInt();// 输入整数
        // System.out.println(a);
        // double b = in.nextDouble();// 输入浮点数
        // System.out.println(b);

        // // Console类输入不可见，可用于读取密码
        // Console cons = System.console();
        // String passw = cons.readLine("pw: ");
        // System.out.println(passw);

        // // 格式化输出
        // double x = 1000.0 / 3.0;
        // System.out.printf("%8.2f\n", x);// 输出8个字符，精度为小数点后2个字符

        // System.out.printf("%tc", new Date());//输出当前时间

        //格式化字符串
        String name="LWZ";
        int day=25;
        String message=String.format("Hello!%s.Next day is %d",name,day );
        System.out.println(message);


        //文件的输入和输出
        /**
         * Scanner("D:\\Dataset\\TXT\\file.txt")
         * 如果不使用Path.of，Scanner会把字符串解释为数据输入，而不是文件名。
         */
        Scanner in =new Scanner(Path.of("D:\\Dataset\\TXT\\file.txt"),StandardCharsets.UTF_8);//加一个/对/转义，指定字符编码为UTF_8
        System.out.println(in.nextLine());

        //写入文件需要构造一个PrintWriter对象
        PrintWriter out=new PrintWriter("D:\\Dataset\\TXT\\file.txt",StandardCharsets.UTF_8);//如果文件不存在则会创建文件

        //! 如果用不存在的文件构造Scanner,或用无法创建的文件名构造一个PrintWriter,就会产生异常
        

    }
}
