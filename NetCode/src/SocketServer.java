import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
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

            while (true) {
                //等待客户端连接
                Socket socket = serverSocket.accept();

                //读取客户端消息
                int read = socket.getInputStream().read();

                byte[] buffer = new byte[1024];
                while (read != -1) {
                    System.out.println(new String(buffer,0,read));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
