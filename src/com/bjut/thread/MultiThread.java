package com.bjut.thread;
/*
*  在静态方法上加上synchronzied关键字，表示锁定.class类，类一级别的锁（独占.class类）
* */
public class MultiThread {
    private static int num = 0;
    /* static*/
    public static synchronized void printNum(String tag){
        try {
            if (tag.equals("a")) {
                num = 100;
                System.out.println("tag a , set num over !");
                Thread.sleep(1000);
            } else {
                num = 200;
                System.out.println("tag b , set num over !");
            }
            System.out.println("tag = " + tag + ", num = " + num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    // 注意观察run方法输出顺序
    public static void main(String[] args){
        // 两个不同的对象
        final MultiThread m1 = new MultiThread();
        final MultiThread m2 = new MultiThread();

        Thread t1 = new Thread(() -> m1.printNum("a"));
        Thread t2 = new Thread(() -> m2.printNum("b"));
        t1.start();
        t2.start();
    }
}
