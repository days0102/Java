/*
 * @Author: Outsider
 * @Date: 2021-12-09 18:18:32
 * @LastEditors: Outsider
 * @LastEditTime: 2021-12-09 18:50:25
 * @Description: In User Settings Edit
 * @FilePath: \Vimd:\Java\Java\NetCode\SocketClient.java
 */

import java.io.OutputStream;
import java.net.*;

public class SocketClient {
    public static void main(String[] arg) {
        try {
            // 获取服务器地址
            InetAddress serverIp = InetAddress.getByName("120.0.0.1");
            // 端口号
            int port = 9999;
            // 创建Socket连接
            Socket socket = new Socket("0.0.0.0", port);
            OutputStream os= socket.getOutputStream();

            os.write("!!!".getBytes());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}