package com.ming.chapter.chapter_1.section_2.mergesort;

import edu.princeton.cs.algs4.StdOut;

/**
 * 自底向上的归并排序
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_2.mergesort
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-23 15:50
 * @Version V1.0
 */
public class MergeBU
{
    /**
     * 归并所需的辅助数组
     */
    private static Comparable[] aux;

    /**
     * 排序
     */
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        aux = new Comparable[N];
        // sz: subarray size
        for (int sz = 1; sz < N; sz = sz + sz)
        {
            // lo: subarray index
            for (int lo = 0; lo < N - sz; lo += sz + sz)
            {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
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

    /**
     * 归并 将a[lo..mid] 和 a[mid..hi]归并
     * @param a
     * @param lo
     * @param mid
     * @param hi
     */
    public static void merge(Comparable[] a, int lo, int mid, int hi)
    {

        int i = lo, j = mid + 1;

        /**
         * 将a[lo..hi]复制到aux[lo..hi]
         */
        for (int k = lo; k <= hi; k++)
        {
            aux[k] = a[k];
        }

        /**
         * 归并回到a[lo..hi]
         */
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid)
            {
                /**
                 * 左半边元素取尽(取右半边的元素)
                 */
                a[k] = aux[j++];
            }
            else if (j > hi)
            {
                /**
                 * 右半边的元素取尽(取左半边的元素)
                 */
                a[k] = aux[i++];
            }
            else if (less(aux[j], aux[i]))
            {
                /**
                 * 右半边的元素小于左半边的元素(取右半边的元素)
                 */
                a[k] = aux[j++];
            }
            else
            {
                /**
                 * 左半边的元素小于右半边的元素(取左半边的元素)
                 */
                a[k] = aux[i++];
            }
        }

        show(a);
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

    public static void main(String[] args)
    {
        Integer[] a = new Integer[] { 9, 2, 5, 4, 3, 6, 1, 8, 0, 7 };
        sort(a);
    }
}
