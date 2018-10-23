package com.ming.chapter.chapter_1.section_2.elementary;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * 选择排序
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_2.elementary
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-18 9:20
 * @Version V1.0
 */
public class Selection {

    /**
     * 选择排序
     * 首先找到数组中最小的元素，与第一个元素交换，然后从剩余的元素中
     * 继续找最小的元素，与第二个交换，依次类推。
     * @param a
     */
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            int min = i;
            for (int j = i + 1; j < N; j++)
            {
                /**
                 * 如果a[j]小于a[min]
                 */
                if (less(a[j], a[min]))
                {
                    min = j;
                }
            }
            exch(a,i,min);
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
