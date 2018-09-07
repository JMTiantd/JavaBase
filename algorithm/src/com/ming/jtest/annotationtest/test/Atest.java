package com.ming.jtest.annotationtest.test;

import com.ming.jtest.annotationtest.anno.A_Anno;

/**
 * 学习一下使用注解
 * https://blog.csdn.net/briblue/article/details/73824058
 * @Title: Atest.java 
 * @Package com.ming.jtest.annotationtest 
 * @author 王武明
 * @date 2018年8月9日 上午9:53:12 
 * @version V1.0
 */


@A_Anno(name = "aa")
public class Atest
{
    public static void main(String[] args)
    {
        boolean annotationPresent = Atest.class.isAnnotationPresent(A_Anno.class);
        if (annotationPresent)
        {
            A_Anno annotation = Atest.class.getAnnotation(A_Anno.class);
            System.out.println(annotation.name());
            System.out.println(annotation.age());
        }
    }
}
