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
    public static void main(String []arg){
        try{
            //创建服务器地址
            ServerSocket sockerServer=new ServerSocket(9999);
            
            //等待客户端连接
            Socket socket=sockerServer.accept();

            //读取客户端消息
            InputStream is=socket.getInputStream();
            ByteArrayOutputStream baos= new ByteArrayOutputStream();
            byte[] buffer=new byte[1024];
            int len;
            while((len=is.read(buffer))!=-1){
                baos.write(buffer, 0, len);
            }

            System.out.println(baos.toString());

            baos.close();
            is.close();
            socket.close();
            sockerServer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            
        }
    }    
}