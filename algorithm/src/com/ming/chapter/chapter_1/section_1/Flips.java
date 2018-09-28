package com.ming.chapter.chapter_1.section_1;

import java.util.Scanner;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 模拟t次抛硬币
 * @Title: Flips.java
 * @Package com.ming.chapter.chapter_1.section_1
 * @author 王武明
 * @date 2018年9月8日 下午8:35:38
 * @version V1.0
 */
public class Flips
{

    /**
     * @author 王武明
     * @date 2018年9月8日 下午8:41:34
     * @param args
     * @return void 返回类型
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        Counter counter = new Counter("heads");
        Counter counter2 = new Counter("tails");
        for (int i = 0; i < T; i++)
        {
            if (StdRandom.bernoulli(0.5))
            {
                counter.increment();
            }
            else
            {
                counter2.increment();
            }
        }

        StdOut.println(counter);
        StdOut.println(counter2);

        int d = counter.tally() - counter2.tally();

        StdOut.println("delta:" + Math.abs(d));

        Counter c1 = new Counter("one");
        c1.increment();
        System.out.println(c1);
        Counter c2 = c1;
        c2.increment();
        System.out.println(c1);

    }

}
