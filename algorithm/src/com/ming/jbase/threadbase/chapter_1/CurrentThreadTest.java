package com.ming.jbase.threadbase.chapter_1;

/**
 * currentThread方法可以返回代码段正在被哪个线程调用的信息
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase.chapter_1
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-20 16:08
 * @Version V1.0
 */
public class CurrentThreadTest extends Thread
{

    public CurrentThreadTest()
    {
        System.out.println("构造方法：" + Thread.currentThread().getName());
    }

    @Override
    public void run()
    {
        System.out.println("run方法 " + Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        CurrentThreadTest currentThreadTest = new CurrentThreadTest();
        currentThreadTest.start();
//        currentThreadTest.run();
    }
}
