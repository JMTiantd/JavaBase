package com.ming.jbase.threadbase.chapter_1;

/**
 * 多线程的使用的两种方式
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-13 9:46
 * @Version V1.0
 */
public class ThreadTest extends Thread
{
    @Override
    public void run()
    {
        System.out.println("extends Thread");
    }

    public static void main(String[] args)
    {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        System.out.println("执行结束！");

        /**
         * 为了启动MyThread，需要首先实例化一个Thread，并传入自己的MyThread实例：
         */
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest);
        thread.start();
    }
}

/**
 * 如果自己的类已经extends另一个类，就无法直接extends Thread，此时，可以实现一个Runnable接口，
 */
class RunnableTest implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("implements Runnable");
    }
}



