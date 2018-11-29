package com.ming.jbase.threadbase.chapter_1;

/**
 * 多线程共享变量与线程安全测试
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-19 17:40
 * @Version V1.0
 */
public class ThreadShareVarTest extends Thread
{
    private int count = 5;

    public ThreadShareVarTest()
    {}

    public ThreadShareVarTest(String name)
    {
        this.setName(name);
    }

    /**
     * 添加了synchronized就是线程安全的 不添加synchronized就是线程不安全的
     * synchronized可以在任意对象以及方法上加锁
     * 而加锁的这段代码称之为“互斥区”或“临界区”
     * 当一个线程想要执行同步方法里面的代码时，线程首先尝试去拿这把锁，
     * 如果能够拿到这把锁，那么这个线程就可以执行synchronized里面的代码。
     * 如果无法拿到这把锁，那么这个线程就会不断的尝试拿这把锁，直到能够拿到为止
     * 而且是多个线程同时去争抢这把锁。
     *
     * 非线程安全：
     * 非线程安全主要是指多个线程对同一个对中的同一个实例变量进行操作时会出现值被更改、
     * 值不同步的情况，进而影响程序的执行流程
     */
    @Override
    synchronized public void run()
    {
        count--;
        System.out.println(" 由 " + this.currentThread().getName() + " 计算，count=" + count);
    }
}

class Test1
{
    public static void main(String[] args)
    {
        ThreadShareVarTest threadShareVarTest1 = new ThreadShareVarTest("A");
        ThreadShareVarTest threadShareVarTest2 = new ThreadShareVarTest("B");
        ThreadShareVarTest threadShareVarTest3 = new ThreadShareVarTest("C");
        System.out.println("-----------这个不共享变量的情况------------");
        // threadShareVarTest1.start();
        // threadShareVarTest2.start();
        // threadShareVarTest3.start();

        System.out.println("-----------共享变量，不加锁的情况----------");

        ThreadShareVarTest threadShareVarTest4 = new ThreadShareVarTest();
        Thread thread1 = new Thread(threadShareVarTest4, "A");
        Thread thread2 = new Thread(threadShareVarTest4, "B");
        Thread thread3 = new Thread(threadShareVarTest4, "C");
        Thread thread4 = new Thread(threadShareVarTest4, "D");
        Thread thread5 = new Thread(threadShareVarTest4, "E");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
