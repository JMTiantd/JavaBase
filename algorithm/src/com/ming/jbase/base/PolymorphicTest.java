package com.ming.jbase.base;

/**
 * 多�?测试
 * @Title: PolymorphicTest.java
 * @Package com.jbase.basetest
 * @author 王武�?
 * @date 2018�?�?5�?下午4:32:57
 * @version V1.0
 */
public class PolymorphicTest
{
    public static void main(String[] args)
    {
        // 未使用多态的思想
        PolymorphicTest polymorphicTest = new PolymorphicTest();
        polymorphicTest.eat(new Bread());
        polymorphicTest.eat(new Noodle());

        System.out.println("...............分割�?...............");

        // 使用多�?
        Food food1 = new Bread2();
        Food food2 = new Noodle2();
        polymorphicTest.eat(food1);
        polymorphicTest.eat(food2);
    }

    public void eat(Bread bread)
    {
        System.out.println("我正在吃" + bread.getName());
    }

    public void eat(Noodle noodle)
    {
        System.out.println("我正在吃" + noodle.getName());
    }

    public void eat(Food food)
    {
        System.out.println("我正在吃" + food.getName());
    }

}

class Bread
{
    private String name;

    public Bread()
    {
        this.name = "面包";
    }

    public String getName()
    {
        return name;
    }
}

class Noodle
{
    private String name;

    public Noodle()
    {
        this.name = "面条";
    }

    public String getName()
    {
        return name;
    }
}

class Bread2 implements Food
{
    private String name;

    public Bread2()
    {
        this.name = "面包";
    }

    @Override
    public String getName()
    {
        return this.name;
    }

}

class Noodle2 implements Food
{
    private String name;

    public Noodle2()
    {
        this.name = "面条";
    }

    @Override
    public String getName()
    {
        return this.name;
    }
}
