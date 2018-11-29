package com.ming.jbase.threadbase.chapter_1;

/**
 * 多线程中start的顺序，不代表线程启动的顺序
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-19 16:34
 * @Version V1.0
 */
public class ThreadStartTest extends Thread
{

    private int i;

    public ThreadStartTest(int i)
    {
        this.i = i;
    }

    @Override
    public void run()
    {
        System.out.println(i);
    }
}

class Test
{
    public static void main(String[] args)
    {
        ThreadStartTest threadStartTest1 = new ThreadStartTest(1);
        ThreadStartTest threadStartTest2 = new ThreadStartTest(2);
        ThreadStartTest threadStartTest3 = new ThreadStartTest(3);
        ThreadStartTest threadStartTest4 = new ThreadStartTest(4);
        ThreadStartTest threadStartTest5 = new ThreadStartTest(5);
        ThreadStartTest threadStartTest6 = new ThreadStartTest(6);
        ThreadStartTest threadStartTest7 = new ThreadStartTest(7);
        ThreadStartTest threadStartTest8 = new ThreadStartTest(8);
        ThreadStartTest threadStartTest9 = new ThreadStartTest(9);
        ThreadStartTest threadStartTest10 = new ThreadStartTest(10);

        threadStartTest1.start();
        threadStartTest2.start();
        threadStartTest3.start();
        threadStartTest4.start();
        threadStartTest5.start();
        threadStartTest6.start();
        threadStartTest7.start();
        threadStartTest8.start();
        threadStartTest9.start();
        threadStartTest10.start();
    }
}
