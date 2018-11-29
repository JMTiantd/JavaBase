package com.ming.jbase.threadbase.chapter_1;

/**
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase.chapter_1
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-20 16:23
 * @Version V1.0
 */
public class CountOperate extends Thread
{
    public CountOperate()
    {
        System.out.println("CountOperate---begin");
        System.out.println("currentThreadName=" + Thread.currentThread().getName());
        System.out.println("this.name=" + this.getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run()
    {
        System.out.println("Run---begin");
        System.out.println("currentThreadName=" + Thread.currentThread().getName());
        System.out.println("this.name=" + this.getName());
        System.out.println("Run---end");
    }

    /**
     * CountOperate---begin
     * currentThreadName=main
     * this.name=Thread-0
     * CountOperate---end
     *
     * Run---begin
     * currentThreadName=A
     * this.name=Thread-0
     * Run---end
     * @param args
     */
    public static void main(String[] args)
    {
        CountOperate countOperate = new CountOperate();
        Thread t1 = new Thread(countOperate);

        t1.setName("A");
        t1.start();
    }
}

