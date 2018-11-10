package com.ming.jbase.base;

/**
 * 抽象类
 * 1.只有声明没有具体的实现
 * 2.如果一个类含有抽象方法，则称这个类为抽象类
 * 3.因为抽象类含有无具体实现的方法，所以不能用抽象类创建对象
 * 4.可以拥有普通的成员变量和普通的成员方法
 * @Project: algorithm
 * @Package com.ming.jbase.base
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-09 11:29
 * @Version V1.0
 */
public abstract class AbstractTest
{

    public int a = 5;

    protected int b = 5;

    /**
     * 抽象方法
     * 1. 抽象方法必须用abstract修饰
     * 2. 抽象方法必须用public或者protected修饰，缺省为public
     * 3. 如果一个类继承于一个抽象类，则子类必须实现父类的抽象方法 如果子类没有实现父类的抽象方法，则必须将子类也定义为abstract类
     */
    public abstract void fun();

    protected abstract void fun2();

    public static void test()
    {
        System.out.println("sss");
    }

    public static void main(String[] args)
    {
        test();
    }

}
