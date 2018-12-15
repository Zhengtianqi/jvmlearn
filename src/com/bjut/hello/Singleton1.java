package com.bjut.hello;

// 饿汉式单例
public class Singleton1 {
    // 私有构造
    private Singleton1(){}
    private static Singleton1 single = new Singleton1();
    public static Singleton1 getIntance(){
        return single;
    }

    public static void main(String[] args){
        System.out.println(single);
    }
}
