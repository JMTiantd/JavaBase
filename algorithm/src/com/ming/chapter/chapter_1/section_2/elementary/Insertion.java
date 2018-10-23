package com.ming.chapter.chapter_1.section_2.elementary;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * 插入排序
 * 对以下情况，插入排序时非常快的
 * 1.数组中每个元素距离它的最终位置都不远
 * 2.一个有序的大数组接一个小数组
 * 3.数组中只有几个元素的位置不正确
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_2.elementary
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-18 9:51
 * @Version V1.0
 */
public class Insertion
{
    /**
     * 插入排序
     * 改进：只需要在内循环中将较大的元素都向右移动而不总是
     * 交换两个元素(这样访问数组的次数就能减半)
     * @param a
     */
    public static void sort(Comparable[] a)
    {
        // 将a[]按照升序排列
        // 就是左边永远是排好序的，i每次加1，左边就会重新排列一次
        int N = a.length;
        for (int i = 1; i < N; i++)
        {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
            {
                exch(a, j, j - 1);
            }
        }
    }

    /**
     * 此方法用来对元素进行比较
     * @param v
     * @param w
     * @return
     */
    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a)
    {
        // Print the array, on a single line.
        for (int i = 0; i < a.length; i++)
        {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a)
    {
        // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++)
        {
            if (less(a[i], a[i - 1]))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        // Read strings from standard input, sort them, and print.
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}




