package org.threaddemo;

public class MyThread extends Thread{
    
    private static int num = 0;
    private String name;
    
    public MyThread() {
        num++;
    }
    
    public MyThread(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        //System.out.println("主动创建的第"+num+"个线程");
        System.out.println("name:"+name+" 子线程ID:"+Thread.currentThread().getId());
    }
}
