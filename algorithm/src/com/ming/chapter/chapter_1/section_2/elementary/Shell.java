package com.ming.chapter.chapter_1.section_2.elementary;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * 希尔排序
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_2.elementary
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-19 9:05
 * @Version V1.0
 */
public class Shell
{

    /**
     * 改进版插入排序
     * 交换不相邻的元素以对数组的局部进行排序
     * 并最终用插入排序将局部有序的数组排序
     *
     * 希尔排序的思想是 使数组中任意间隔为h的元素都是有序的。
     * 这样的数组称为h有序数组。
     *
     * @param a
     */
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        int h = 1;
        while (h < N / 3)
        {
            /**
             * 1,4,13,40,121,364,1093......
             */
            h = h * 3 + 1;
        }

        while (h >= 1)
        {
            // 将数组变为h有序 h可以是3*h+1,
            // 但是最终h是会变成1的,也就是说
            // 最后会变成以间隔为1进行排序
            for (int i = h; i < N; i++)
            {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h)
                {
                    exch(a, j, j - h);
                }
            }

            h = h / 3;
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
