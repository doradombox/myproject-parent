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
        System.out.println("主线程ID:"+Thread.currentThread().getId());
        System.out.println("主线程ID:"+Thread.currentThread().getName());
        MyThread thread0 = new MyThread();
        thread0.start();
        MyThread thread1 = new MyThread("thread1");
        thread1.start();
        MyThread thread2 = new MyThread("thread2");
        thread2.run();
    }
}
