package com.ming.jbase.threadbase.chapter_1;

/**
 * 测试线程执行的随机性和不确定性
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-19 14:18
 * @Version V1.0
 */
public class MyThread extends Thread
{

    @Override
    public void run()
    {
        try
        {
            for (int i = 0; i < 10; i++)
            {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}

class MythreadTest
{

    /**
     * 这个测试说明了 CPU执行那个线程是不确定的
     * @param args
     */
    public static void main(String[] args)
    {
        try {
            MyThread myThread = new MyThread();
            myThread.setName("mythread");
            myThread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
