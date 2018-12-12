package Patterns;

import java.security.Signature;

/**
 * @Author: dudg
 * @Date: Created in 14:46 2018/11/22
 * @Description:
 */
public class Singleton {
    private static Singleton singleton;
    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return singleton;
    }
}

 /*
    //内部静态类
    private static class SingletonHelper{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHelper.instance;
    }*/

/*
    //同步锁机制
    private volatile static Singleton singleton;
    public static Singleton getInstance(){
        if(singleton == null){ //注：如果没有这一行等同于加锁整个方法效率低 synchronized public static Singleton getInstance()
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }*/


/*
    //普通写法
    private static Singleton singleton;
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    */
