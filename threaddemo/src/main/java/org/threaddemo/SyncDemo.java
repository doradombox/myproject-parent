package org.threaddemo;

public class SyncDemo {
    public void sync() {
        synchronized (SyncDemo.class) {
            System.out.println();
        }
    }

}
