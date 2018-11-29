package com.ming.jbase.threadbase.chapter_1;

/**
 * print和i++一起使用的多线程问题
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase.chapter_1
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-20 15:22
 * @Version V1.0
 */
public class ThreadPlusTest extends Thread
{
    private int i = 5;

    @Override
    public void run()
    {
        /**
         * i--操作是在println方法之前操作的
         * 虽然println方法在前面添加了synchronized
         * 但是i--操作是在println方法之前操作的
         * 所以还是有发生非线程安全的概率的
         */
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }

}

class RunThreadPlusTest
{
    public static void main(String[] args)
    {
        ThreadPlusTest threadPlusTest = new ThreadPlusTest();
        Thread thread1 = new Thread(threadPlusTest);
        Thread thread2 = new Thread(threadPlusTest);
        Thread thread3 = new Thread(threadPlusTest);
        Thread thread4 = new Thread(threadPlusTest);
        Thread thread5 = new Thread(threadPlusTest);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
