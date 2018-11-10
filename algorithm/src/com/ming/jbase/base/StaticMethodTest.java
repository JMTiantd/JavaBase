package com.ming.jbase.base;

/**
 * 构造器和静态方法的执行顺序
 * 创建对象时构造器的调用顺序是：
 * 先初始化静态成员，然后调用父类构造器，
 * 再初始化非静态成员，最后调用自身构造器。
 *
 * @Project: algorithm
 * @Package com.ming.jbase.base
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-09 15:51
 * @Version V1.0
 */
public class StaticMethodTest
{

    public static void main(String[] args)
    {
        A ab = new B();
        ab = new B();
    }

}

class A
{

    static
    {
        System.out.print("1");
    }

    public A()
    {
        System.out.print("2");
    }
}

class B extends A
{
    static
    {
        System.out.print("a");
    }

    public B()
    {
        System.out.print("b");
    }
}