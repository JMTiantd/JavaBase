package com.ming.jtest.annotationtest.anno;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 创建一个注解 https://blog.csdn.net/briblue/article/details/73824058
 * @Title: A_Anno.java
 * @Package com.ming.jtest.annotationtest.anno
 * @author 王武明
 * @date 2018年8月9日 上午10:14:21
 * @version V1.0
 */
// @interface 就是代表创建了一张 名字是Atest的标签
/**
 * Retention 的英文意为保留期的意思。当 @Retention 应用到一个注解上的时候，它解释说明了这个注解的的存活时间。 它的取值如下： -
 * RetentionPolicy.SOURCE 注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视。 - RetentionPolicy.CLASS
 * 注解只被保留到编译进行的时候，它并不会被加载到 JVM 中。 - RetentionPolicy.RUNTIME
 * 注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们。
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface A_Anno
{
    String name();

    public int age() default 25;
}
