import java.time.chrono.ThaiBuddhistEra;

/*
 * @Author: Outsider
 * @Date: 2021-11-18 20:45:56
 * @LastEditors: Outsider
 * @LastEditTime: 2021-11-19 23:02:10
 * @Description: In User Settings Edit
 * @FilePath: \Java\JavaBasic\src\MultiThread.java
 */
public class MultiThread {
    public static void main(String []arg)
    {
        thread_1 t_1=new thread_1();
        t_1.start();//启动线程

        thread_2 t_2=new thread_2();
        new Thread(t_2).start();

        //lambada表达式创建实例
        Runnable r=()->{
            for(int i=0;i<10;i++){
                System.out.println("lambda!");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    
                }
            }
        };
        new Thread(r).start();

        for(int i=0;i<10;i++){
            System.out.println("main!");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){

            }
        }
    }
}

//Thread类本身实现了Runnable接口，并持有run方法，但该方法为空，继承Thread要重写run()
class thread_1 extends Thread{//继承实现多线程的类Thread
    @Override
    public void run(){//重写run函数
        for(int i=0;i<10;i++)
        {
            System.out.println("thread_1!");
            try{
                Thread.sleep(1000);//线程的暂停
            }
            catch(InterruptedException e){

            }
        }
    }
}

class thread_2 implements Runnable{//利用Runnable接口实现多线程
    public void run(){//实现run方法
        for(int i=0;i<10;i++)
        {
            System.out.println("thread_2!");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                
            }
        }
    }
}
