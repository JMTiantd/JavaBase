package com.ming.jbase.threadbase.chapter_1;

/**
 * sleep()方法 方法sleep的作用是在指定的毫秒数内让当前正在执行的线程休眠 这个正在执行的线程是指
 * this.currentThread()返回的线程
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase.chapter_1
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-21 13:42
 * @Version V1.0
 */
public class SleepTest extends Thread
{
    @Override
    public void run()
    {
        try
        {
            System.out.println("run threadName=" + this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        SleepTest sleepTest = new SleepTest();
        System.out.println("begin = " + System.currentTimeMillis());
        sleepTest.start();
        System.out.println("end = " + System.currentTimeMillis());
    }

}
