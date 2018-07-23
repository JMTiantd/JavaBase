package com.ming.chapter.chapter_1.exercise_1;

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
        ex_1_1();
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
    
    
    
}

