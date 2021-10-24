
//静态导入Math
import static java.lang.Math.*;//使用该语句后使用Math的函数后变量时不用再前面加Math

public class MathClass {

    // Math类种包含各种数学函数
    public static void main(String[] args) {
        double a = 4;
        double b = Math.sqrt(a);
        System.out.println(b);
        System.out.println(Math.exp(5));
        System.out.println(Math.E);// e的近似值
        System.out.println(Math.PI);// pi的近似值

        System.out.println(E);

        double x = 9.997;
        int nx = (int) x;// 强制类型转换，截断了小数部分
        System.out.println(nx);

        // 舍入运算使用Math.round()
        int nnx = (int) Math.round(x);
        System.out.println(nnx);

    }
}
