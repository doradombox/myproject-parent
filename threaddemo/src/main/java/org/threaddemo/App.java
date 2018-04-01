package org.threaddemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);
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
