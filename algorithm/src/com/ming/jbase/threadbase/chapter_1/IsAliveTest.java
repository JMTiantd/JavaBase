package com.ming.jbase.threadbase.chapter_1;

/**
 * isAlive 判断当前线程是否处于活动状态
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase.chapter_1
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-21 11:12
 * @Version V1.0
 */
public class IsAliveTest extends Thread
{

    @Override
    public void run()
    {
        System.out.println("run=" + this.isAlive());
    }

    /**
     * result:
     *
     * 开始前：ISAlive = false
     * end：ISAlive = true
     * run=true
     *
     * @param args
     */
    public static void main(String[] args)
    {
        IsAliveTest aliveTest = new IsAliveTest();
        System.out.println("开始前：ISAlive = " + aliveTest.isAlive());
        aliveTest.start();
        //这个值应该是不确定的，因为不知道是否线程已经执行完毕
        //如果线程已经执行完毕则应该为false，未执行完毕为true
        System.out.println("end：ISAlive = " + aliveTest.isAlive());
    }

}
