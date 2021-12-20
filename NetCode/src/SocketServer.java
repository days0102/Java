import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * @Author: Outsider
 * @Date: 2021-12-09 18:30:32
 * @LastEditors: Outsider
 * @LastEditTime: 2021-12-09 18:49:59
 * @Description: In User Settings Edit
 * @FilePath: \Vimd:\Java\Java\NetCode\SocketServer.java
 */

public class SocketServer {
    public static void main(String[] arg) {
        try {
            //创建服务器地址
            ServerSocket serverSocket = new ServerSocket(9999);

            //等待客户端连接
            System.out.println("等待客户端连接");
            Socket socket = serverSocket.accept();
            System.out.println("客户端连接成功");

//            //读取客户端消息
//            var is = socket.getInputStream();//获取一个socket对象的输入流
//
//            var baos = new ByteArrayOutputStream();
//            int len = 0;
//            byte[] buffer = new byte[1024];
//            while ((len = is.read(buffer)) != -1) {
//                baos.write(buffer, 0, len);
//            }
//            System.out.println("收到了来自于客户端" + socket.getInetAddress().getHostName()
//                    + "的消息：" + baos.toString());
        }catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
