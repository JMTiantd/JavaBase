package com.ming.chapter.chapter_1.section_1;

public class Test1
{

    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3 };
        System.out.println("ss");
        System.out.println(a.length);

        System.out.println(a[0]);
        int[] b = a;
        b[0] = 5;
        System.out.println(a[0]);

        change(a);

        System.out.println(a[0]);

        Person aPerson = new Person();
        aPerson.setName("zhangsna");
        change(aPerson);

        System.out.println(aPerson.getName());

        int num = 5;
        cantChange(num);
        System.out.println(num);

    }

    public static void cantChange(int a)
    {
        a = 456;
    }

    public static void change(int[] a)
    {
        a[0] = 100;
    }

    public static void change(Person p)
    {
        p.setName("sss");
    }
}

class Person
{
    String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}