package org.threaddemo;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        /*System.out.println("主线程ID:"+Thread.currentThread().getId());
        System.out.println("主线程ID:"+Thread.currentThread().getName());
        MyThread thread0 = new MyThread();
        thread0.start();
        MyThread thread1 = new MyThread("thread1");
        thread1.start();
        MyThread thread2 = new MyThread("thread2");
        thread2.run();*/
        
        //不共享数据,也就是不共享变量.各自计算自己的
        /*MyThread2 mythread = new MyThread2();
        Thread a = new Thread(mythread,"A");
        Thread b = new Thread(mythread,"B");
        Thread c = new Thread(mythread,"C");
        Thread d = new Thread(mythread,"D");
        Thread e = new Thread(mythread,"E");
        a.start();
        b.start();
        c.start();
        e.start();
        d.start();*/
        
        
        
        MyThread mythread = new MyThread();
        mythread.start();
        System.out.println("运行结束!");
        System.out.println("主线程:"+Thread.currentThread().getName());
        System.out.println("主线程:"+mythread.getName());
        
        
        
        
    }
}
