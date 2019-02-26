package com.bjut.TheWorldOfConcurrent.Chapter4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService sec = Executors.newScheduledThreadPool(10);
        // 如果前面的任务没有完成，则调度也不会启动

    }
}
