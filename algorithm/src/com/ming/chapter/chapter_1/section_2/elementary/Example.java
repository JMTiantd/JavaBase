package com.ming.chapter.chapter_1.section_2.elementary;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

/**
 * 排序方法模板 这个类展示的是数组排序实现的框架。 适用于任意实现了Comparable接口的数据类型
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_2.elementary
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-09 16:00
 * @Version V1.0
 */
public class Example
{
    public static void sort(Comparable[] a)
    { /* See Algorithms 2.1, 2.2, 2.3, 2.4, 2.5, or 2.7. */ }

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

    @Test
    public void lessTest()
    {
        Integer[] a = new Integer[] { 3, 1, 5, 6, 7, 4, 2, 9, 8, 0 };
        System.out.println(less(a[0], a[1]));
        System.out.println(less(a[1], a[2]));
    }

}
