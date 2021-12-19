import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.JFrame;//Swing类位于javax.swing中

import org.w3c.dom.css.Rect;

import static javax.swing.JOptionPane.showMessageDialog;

/*
 * @Author: Outsider
 * @Date: 2021-10-31 20:47:18
 * @LastEditors: Outsider
 * @LastEditTime: 2021-12-15 23:29:52
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
            frame.setBounds(200,100,400,300);//改变窗口大小和位置
            frame.setLocation(300,150);//改变窗体的位置

            JLabel label1=new JLabel("用户名:");
            JLabel label2=new JLabel("密码:");
            label1.setBounds(50,50,60,30);
            label2.setBounds(50,100,60,30);

            JButton button1 = new JButton("确定");
            JButton button2=new JButton("取消");
            button1.addActionListener(new EventAction());
            button1.setBounds(100,100,60,30);
            button2.addActionListener(new EventAction());
            button2.setBounds(100,200,60,30);
            JButton button=new JButton("登录");
            button.setBounds(60,150,60,30);
            button.addActionListener(new EventAction());

            JTextField text1=new JTextField();
            text1.setBounds(100,50,150,30);
            JTextField text2=new JTextField();
            text2.setBounds(100,100,150,30);
            frame.getContentPane().setLayout(null);

            frame.add(label1);
            frame.add(label2);

            frame.getContentPane().add(text1);
            frame.getContentPane().add(text2);

            frame.add(button);
            //frame.getContentPane().add(button1);
            //frame.getContentPane().add(text2);
            //frame.getContentPane().add(button2);

            //frame.add(new Message());//添加组件
            //frame.add(new ButtonPanel().panel);
        });
    }
}

class SimpleFrame extends JFrame//* AWT库Frame类描述顶层窗口，Swing中JFrame拓展了这个类
{
    public SimpleFrame()
    {
        setSize(300,600);//设置初始窗口大小
    }
}

class Message extends JComponent{
    public void paintComponent(Graphics g){
        g.drawString("GuiApp", 200, 300);//绘制字符串
        var g2=(Graphics2D) g;
        g2.setPaint(Color.RED);
        var rect=new Rectangle2D.Double(10,10,20,20);
        g2.draw(rect);
    }
}

class ButtonPanel {
    public JPanel panel=new JPanel();

    private JButton button1=new JButton();
    private JButton button2=new JButton();


    public ButtonPanel(){

        panel.add(button1);
        panel.add(button2);
        button1.addActionListener(new EventAction());
        button1.setBounds(20,20,60,40);
        button2.setBounds(50,20,30,15);
        //showMessageDialog(null,"!!");
    }
}

class EventAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        showMessageDialog(null,"!");
    }
}