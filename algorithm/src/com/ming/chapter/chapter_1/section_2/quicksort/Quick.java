package com.ming.chapter.chapter_1.section_2.quicksort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 快速排序-基本算法 分治的排序算法 原地排序(只需要一个很小的辅助栈) 且将长度为N的数组排序所需的时间和NlgN成正比
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_2.quicksort
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-25 14:21
 * @Version V1.0
 */
public class Quick
{
    public static void sort(Comparable[] a)
    {
        // 消除对输入的依赖
        StdRandom.shuffle(a);

        System.out.println("-------开始--------");
        show(a);

        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo)
        {
            return;
        }

        // 切分
        int j = partition(a, lo, hi);

        // 将左半部分a[lo..j-1]排序
        sort(a, lo, j - 1);

        // 将右半部分a[j+1..hi]排序
        sort(a, j + 1, hi);
    }

    /**
     * 切分
     * 返回值j需要满足以下三个条件
     * 1.对于某个j，a[j]已经排定
     * 2.a[lo]到a[j-1]中的所有元素都不大于a[j]
     * 3.a[j+1]到a[hi]中的所有元素都不小于于a[j]
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    private static int partition(Comparable[] a, int lo, int hi)
    {
        // 将数组切分为a[lo..i-1],a[i],a[i+1..hi]
        // 左右扫描指针
        int i = lo, j = hi + 1;

        // 切分元素
        Comparable v = a[lo];

        while (true)
        {
            while (less(a[++i], v))
            {
                if (i == hi)
                {
                    break;
                }
            }

            while (less(v, a[--j]))
            {
                if (j == lo)
                {
                    break;
                }
            }

            if (i >= j)
            {
                break;
            }

            exch(a, i, j);
        }

        // 将v = a[j]放入正确的位置
        exch(a, lo, j);

        // a[lo..j-1] <= a[j+1..hi] 达成
        return j;
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

    /**
     * 交换元素内容
     * @param a
     * @param i
     * @param j
     */
    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;

        show(a);
    }

    /**
     * 显示
     * @param a
     */
    private static void show(Comparable[] a)
    {
        // Print the array, on a single line.
        for (int i = 0; i < a.length; i++)
        {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static void main(String[] args)
    {
        Integer[] a = new Integer[] { 3, 1, 5, 6, 7, 4, 2, 9, 8, 0 };
        sort(a);
        show(a);
    }

}
