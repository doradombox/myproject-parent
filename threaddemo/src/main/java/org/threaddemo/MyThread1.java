package org.threaddemo;

/**
 * 不共享数据多线程
 * @author huangwenbo
 *
 */
public class MyThread1 extends Thread{
    private int count = 5;
    
    public MyThread1(String name){
        super();
        this.setName(name);
    }
    
    @Override
    public void run() {
        super.run();
        while(count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算,count=" +count);
        }
    }
    
}
