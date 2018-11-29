package com.ming.jbase.threadbase.chapter_1;

/**
 * 停止线程
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase.chapter_1
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-22 13:33
 * @Version V1.0
 */
public class InterruptTest extends Thread
{

    @Override
    public void run()
    {
        for (int i = 0; i < 500; i++)
        {
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args)
    {
        try
        {
            InterruptTest interruptTest = new InterruptTest();

            interruptTest.start();
            Thread.sleep(2000);
            interruptTest.interrupt();

            /**
             * Thread.interrupted()方法 测试当前线程是否已经中断，这个 “当前线程”是main，它从未中断过 所以打印的结果是两个false
             */
            System.out.println("是否停止1？ = " + Thread.interrupted());
            System.out.println("是否停止2？ = " + Thread.interrupted());

        }
        catch (InterruptedException e)
        {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }

}

class InterruptTest2
{

    /**
     * interrupted方法具有清除状态的功能
     * @param args
     */
    public static void main(String[] args)
    {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？= " + Thread.interrupted());
        System.out.println("是否停止2？= " + Thread.interrupted());
        System.out.println("end");
    }

}
