import java.awt.EventQueue;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;//Swing类位于javax.swing中

/*
 * @Author: Outsider
 * @Date: 2021-10-31 20:47:18
 * @LastEditors: Outsider
 * @LastEditTime: 2021-11-25 11:16:04
 * @Description: In User Settings Edit
 * @FilePath: \Java\JavaBasic\src\Gui.java
 */
public class Gui {
    public static void main(String []arg)
    {
        //事件分派线程，用于监测用户的操作
        EventQueue.invokeLater(()->
        {
            //Frame默认创建一个0*0的窗口,SimpleFrame为Frame的一个子类
            var frame=new SimpleFrame();
            //JFrame是不绘制在画布上的Swing组件，他的修饰部件由用户的窗口系统绘制
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体响应事件
            frame.setVisible(true);//显示窗体
            frame.setTitle("GuiApp");//设置标题
            frame.setBounds(200,100,400,600);//改变窗口大小和位置
            frame.setLocation(300,150);//改变窗体的位置
            
            frame.add(new Message());//添加组件
        });
    }
}

class SimpleFrame extends JFrame//* AWT库Frame类描述顶层窗口，Swing中JFrame拓展了这个类
{
    public SimpleFrame()
    {
        setSize(600,300);
    }
}

class Message extends JComponent{
    public void paintComponent(Graphics g){
        g.drawString("GuiApp", 200, 300);//绘制字符串
    }
}