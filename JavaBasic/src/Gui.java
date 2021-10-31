import java.awt.EventQueue;
import javax.swing.JFrame;//Swing类位于javax.swing中

/*
 * @Author: Outsider
 * @Date: 2021-10-31 20:47:18
 * @LastEditors: Outsider
 * @LastEditTime: 2021-10-31 21:02:55
 * @Description: In User Settings Edit
 * @FilePath: \Java\JavaBasic\src\Gui.java
 */
public class Gui {
    public static void main(String []arg)
    {
        EventQueue.invokeLater(()->
        {
            var frame=new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
        );
    }
}

class SimpleFrame extends JFrame//* AWT库Frame类描述顶层窗口，Swing中JFrame拓展了这个类
{
    public SimpleFrame()
    {
        setSize(600,300);
    }
}