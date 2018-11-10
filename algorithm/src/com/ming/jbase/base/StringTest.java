package com.ming.jbase.base;

public class StringTest
{

    public static void main(String[] args)
    {

        String a = "Programming";
        String b = new String("Programming");

        String c = "Program" + "ming";

        System.out.println(a == b); // false
        System.out.println(a == c); // true
        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // true
        System.out.println(a.intern() == b.intern()); // true

        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;

        System.out.println(s1 == s2);// false
        System.out.println(s1 == s5);// true
        System.out.println(s1 == s6);// false
        System.out.println(s1 == s6.intern());// true
        System.out.println(s2 == s2.intern());// false

        String[] arr = new String[]{"aa","vv"};
        System.out.println(arr.length);
        System.out.println(s5.length());

    }

    /**
     * String和StringBuilder、StringBuffer的区别
     */
    public static void stringBuilderTest()
    {

    }



}
