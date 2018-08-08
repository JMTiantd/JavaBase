package com.ming.chapter.chapter_1.exercise_1;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 练习1.1.1~1.1.10
 * @Title: Exercise1_10.java 
 * @Package com.ming.chapter.chapter_1.exercise_1 
 * @author 王武明
 * @date 2018年7月22日 下午6:23:30 
 * @version V1.0
 */
public class Exercise1_10
{

    public static void main(String[] args)
    {
//          ex_1_1();
//          ex_1_2();
//          ex_1_3();
//          ex_1_5(0.00000000000000000000000001, 0.99999999999999999);// false
//          ex_1_5(0.00000000000000000000000001, 0.9999999999999999);// true
//          ex_1_6();
//          ex_1_7();
        ex_1_8();
        ex_1_9(5);
    }

    /**
     * 练习1.1.1
     * 给出以下表达式的值
     * @author 王武明
     * @date 2018年7月22日 下午6:28:30 
     * @return void    返回类型
     */
    public static void ex_1_1()
    {
        /**
         *7
         *2.0E-6
         *200.0000002
         *true
         *true
         */
        System.out.println((0 + 15)/2);
        System.out.println(2.0e-6);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
        System.out.println(false && true || true && true);
        System.out.println(true && false|| true && false);
        
        /**
         * e的相关用法
         * true
         * true
         * false
         * 1.0E-12
         * 9.999999999999999E-6
         */
        System.out.println("-------------------------");
        System.out.println(1.e-12 == Math.pow(10, -12));
        System.out.println(1e-12==Math.pow(10,-12));
        System.out.println(1e-5==Math.pow(10,-5));
        System.out.println(Math.pow(10,-12));
        System.out.println(Math.pow(10,-5));
        System.out.println((float)Math.pow(10,-5));
        double a = 1.e-12;
        double b = 1.e-5;
        
        /**
         * &&或者||的用法
         * true
         * true
         * false
         * false
         * true
         * true
         */
        System.out.println("-----------------");
        System.out.println(true||false && true);
        System.out.println(true||false && true && false);//????
        System.out.println(false||true && true && false);//????
        System.out.println((true||false) && true && false);
        System.out.println(true||false && true || false);
        System.out.println(true||false && true || true && false);
    
    }
    
    /**
     * 给出一下表达式的类型和值
     * @author 王武明
     * @date 2018年7月23日 上午10:51:16 
     * @return void    返回类型
     */
    public static void ex_1_2()
    {
        double a = (1 + 2.236)/2;
        double b =  1+2+3+4.0;
        boolean c = (4.1 >= 4);
//        int = 1+2+"3"; //error
//        String = 1+2+"3"; //error
        /**
         * 1.618
         * 10.0
         * true
         * 33
         */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(1+2+"3");
    }
    
    /**
     * 1.1.3
     * 编写一个程序从命令行得到三个整数参数。如果它们都相等则打印
     * equal，否则打印not equal
     * @author 王武明
     * @date 2018年7月23日 下午1:07:09 
     * @return void    返回类型
     */
    public static void ex_1_3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第1个参数：");
        int a = scanner.nextInt();
        System.out.println("请输入第2个参数：");
        int b = scanner.nextInt();
        System.out.println("请输入第3个参数：");
        int c = scanner.nextInt();
        
        if (a == b && a == c)
        {
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
    
    /**
     * 下列语句各有什么问题？
     * 如果有的话，请指出来哪的问题
     * @author 王武明
     * @date 2018年7月23日 下午1:20:28 
     * @return void    返回类型
     */
    public static void ex_1_4()
    {
       int  a = 5;
       int  b = 6;
       int  c = 6;
//       if (a > b) then c = 0;  java没有then关键字
//       if a>b { c=0;   } 条件必须带上小括号
       if (a > b) c= 0; // ok
//       if (a > b) c = 0 else b = 0; 少一个冒号
    }
    
    /**
     * 1.1.5
     * 编写一个程序，如果double类型的变量x和变量y都严格位于0和1之间则打印true，否则打印false
     * @author 王武明
     * @date 2018年7月23日 下午1:29:02 
     * @return void    返回类型
     */
    public static void ex_1_5(double a,double b)
    {
        System.out.println("-------------------------");
        if (Double.isNaN(a) || Double.isNaN(b) || Double.isInfinite(a) || Double.isInfinite(b))
        {
            System.out.println(false);
        }
        
        BigDecimal ab = new BigDecimal(String.valueOf(a));
        BigDecimal bb = new BigDecimal(String.valueOf(b));
        if (ab.compareTo(BigDecimal.ZERO) > 0 
                && ab.compareTo(new BigDecimal("1")) <0
                && bb.compareTo(BigDecimal.ZERO) > 0 
                && bb.compareTo(new BigDecimal("1")) <0)
        {
            System.out.println(ab.compareTo(BigDecimal.ZERO));
            System.out.println(ab.compareTo(new BigDecimal("1")));
            System.out.println(bb.compareTo(BigDecimal.ZERO));
            System.out.println(bb.compareTo(new BigDecimal("1")));
            System.out.println(true);
        }else{
            System.out.println(ab.compareTo(BigDecimal.ZERO)); 
            System.out.println(ab.compareTo(new BigDecimal("1")));
            System.out.println(bb.compareTo(BigDecimal.ZERO));
            System.out.println(bb.compareTo(new BigDecimal("1"))); // 0.999999999999999999999 == 1 ? 
            System.out.println(false);
        }
        
    }

    /**
     * 下面这段程序会打印出什么
     * 答：0和1开头的斐波那契数列
     * @author 王武明
     * @date 2018年7月23日 下午2:24:13 
     * @return void    返回类型
     */
    public static void ex_1_6()
    {
        int f = 0;
        int g = 1;
        
        for(int i = 0;i<=15;i++)
        {
            System.out.println(f);
            f=f+g;
            g=f-g;
        }
    }
    
    /**
     * 分别给出以下代码段打印出的值
     * @author 王武明
     * @date 2018年7月23日 下午2:28:40 
     * @return void    返回类型
     */
    public static void ex_1_7()
    {
        System.out.println("----------------------------------");
        System.out.println(9.0/8.0 + 8.0);
        System.out.println(9.125/2);
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
        {
            System.out.println("t: " + t + " t - 9.0/t: " + (t - 9.0/t));
            t = (9.0/t + t) /2.0;
            System.out.println("(9.0/t + t) /2.0 运算后： t: " + t);
        }
        System.out.printf("%.5f\n", t);
        
        int sum = 0;
        for (int i = 1; i < 1000; i++)
        {
            for (int j = 0; j < i; j++)
            {
                sum++;
            }
        }
        System.out.println("sum: " + sum);
        System.out.println("sum: " + 999*(999+1)/2);//等差数列求和
        
        int csum = 0;
        for(int i = 1; i < 1000; i *= 2)
        {
            for(int j = 0;j < 1000; j++)
            {
                csum++;
            }
        }
        System.out.println(csum); //10 * 1000
    }
    
    /**
     * 下列语句会打印出什么结果？给出解释
     * @author 王武明
     * @date 2018年7月23日 下午5:17:10 
     * @return void    返回类型
     */
    public static void ex_1_8()
    {
        System.out.println("-----------------------");
        System.out.println('b');//b
        System.out.println('b' + 'c'); //197
        System.out.println('a' + 4); //101
        System.out.println((char)('a' + 4)); //e
    }
    
    /**
     * 编写代码，将一个正整数N用二进制表示并转换为一个string类型的值s。
     * @author 王武明
     * @date 2018年7月23日 下午5:50:31 
     * @return void    返回类型
     */
    public static void ex_1_9(int i)
    {
        System.out.println("-------------------");
        //方法一
        String binaryString = Integer.toBinaryString(i);
        System.out.println(binaryString);
        
        //方法二
        String string = "";
        for(int n = i;n > 0; n/=2)
        {
            string = (n % 2) + string;
        }
        System.out.println(string);
        
        //方法三
        
    }
    
    public static void ex_1_10()
    {
        
    }
    
}

