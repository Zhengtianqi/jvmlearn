package com.bjut.TheWorldOfConcurrent.Chapter2;
/**
* 只显示的让t1线程interrupt  只能让线程进行中断
* 但是必须为它增加相应的中断处理代码，即判断线程是否处于中断的状态，然后break的方式来结束线程
 * */
public class InterruptThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            while (true){
                /* ----start ---*/
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Interrupted!");
                    break;
                }
                /*----end-----*/
                Thread.yield();
            }
        });
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
