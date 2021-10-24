import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[]args)
    {
        int []a=new int[10];
        Scanner in =new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

        //for each循环
        for(int i:a)//遍历的是数组的元素。而不是下标
            System.out.println(i);
        System.out.println(Arrays.toString(a));//返回一个包含数组元素的字符串
        System.out.println(args);


        //数组拷贝
        int[] b=a;//相当于地址赋值
        b[1]=100;
        System.out.println(a[1]);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
    
