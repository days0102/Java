public class string {
    public static void main(String[] args) {
        String e = "";// 空字符串
        System.out.print(e);
        String str = "Hello";
        String s = str.substring(0, 3);// str的字串，左开右闭

        // 拼接
        String str1 = "Mike";
        String message = str + str1;
        System.out.println(message);// 中间没有空格
        System.out.println("Hello " + str1);

        // 多个字符串放在一起，用一个界定符分隔
        String all = String.join("/", "S", "M", "L");// S/M/L
        System.out.println(all);

        String repeat = "Java".repeat(3);
        System.out.println(repeat);

        // 检测字符串是否相等（不可是用==）s.equals(t),s和t可以是字符串变量和字面量
        str.equals(str1);
        "Hello".equals(str);
        "hello".equalsIgnoreCase(str);// 不区分大小写
        // compareTo()，类似C的strcmp
        str.compareTo("Hello");

        // 空串和Null串
        /* 空串是长度为0的字符串，Null串是一个null值 */
        boolean s1 = str.length() == 0;// 判断空串
        boolean s2 = str.equals("");// 判断空串

        boolean s3 = str == null;// 判断null串
        boolean s4 = str != null && str.length() != 0;// 判断null串，首先要判断是否为null串，在null串上调用方法会出现错误

        // 码点和代码单元
        int n1 = str.length();// 返回UTF-16编码表示字符串所需的代码单元数量
        int n2 = str.codePointCount(0, str.length());// 返回实际长度，即码点数量

        // 构造字符串
        StringBuilder builder = new StringBuilder();// 字符串构建器
        builder.append("hello");
        builder.append("!");
        String completed = builder.toString();// 调用函数获取String，返回一个与构建器或缓冲器内容相同的字符串
        System.out.println(completed);
        
    }
}
