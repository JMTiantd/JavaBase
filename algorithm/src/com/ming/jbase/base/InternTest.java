package com.ming.jbase.base;

/**
 * intern()方法测试
 *
 * http://www.runoob.com/java/java-string-intern.html
 *
 * @Project: algorithm
 * @Package com.ming.jbase.base
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-08 16:11
 * @Version V1.0
 */
public class InternTest
{

    public static void main(String[] args)
    {
        String string1 = "a";
        String string2 = "b";
        String string3 = "ab";
        String string4 = string1 + string2;
        String string5 = new String("ab");

        System.out.println(string5.equals(string3));
        System.out.println(string5 == string3);
        System.out.println(string5.intern() == string3);
        System.out.println(string5.intern() == string4); //false

        String a = new String("ab");
        String b = new String("ab");
        String c = "ab";
        String d = "a" + "b";
        String e = "b";
        String f = "a" + e;

        System.out.println(b.intern() == a);
        System.out.println(b.intern() == c);
        System.out.println(b.intern() == d);
        System.out.println(b.intern() == f);
        System.out.println(b.intern() == a.intern());

        String aa = "abc";
        String bb = "abc";
        String cc = "a" + "b" + "c";
        String dd = "a" + "bc";
        String ee = "ab" + "c";

        System.out.println(aa == bb);
        System.out.println(aa == cc);
        System.out.println(aa == dd);
        System.out.println(aa == ee);
        System.out.println(cc == dd);
        System.out.println(cc == ee);

        //???
        String s1 = new StringBuilder("go").append("od").toString();
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2.intern() == s2);
        String s3 = new StringBuilder("ja").append("vas").toString();
        System.out.println(s3.intern() == s3);

    }

}
