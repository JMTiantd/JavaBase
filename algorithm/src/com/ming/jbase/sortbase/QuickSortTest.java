package com.ming.jbase.sortbase;

/**
 * 快�?排序
 * @Title: QuickSortTest.java
 * @Package com.jbase.sorttest
 * @author 王武�?
 * @date 2018�?�?9�?下午1:43:35
 * @version V1.0
 */
public class QuickSortTest
{

    /**
     * 将数组的某一段划分，小的在左边，大的在右�?
     * @author 王武�?
     * @date 2018�?�?9�?下午2:01:11
     * @param a
     * @param start
     * @param end
     * @return
     * @return int 返回类型
     */
    public static int divide(int[] a, int start, int end)
    {
        // 每次都以�?��边的元素作为基准�?
        int base = a[end];

        // start�?��等于end，就说明左右两个指针合并到了同一位置，可以结束此轮循�?
        while (start < end)
        {
            while (start < end && a[start] <= base)
            {
                start++;
            }

            // 上面的while循环结束时，就说明当前的a[start]的�?比基准�?大，应与基准值进行交�?
            if (start < end)
            {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                // 交换后，此时的那个被调换的�?也同时调到了正确的位置（基准值右边），因此右边也要同时向前移动一�?
                end--;
            }

            while (start < end && a[end] >= base)
            {
                // 从右边开始遍历，如果比基准�?大，就继续向做走
                end--;
            }

            // 上面的while循环结束时，就说明当前的a[end]的�?比基准�?小，应与基准值进行交�?
            if (start < end)
            {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                // 交换后，此时的那个被调换的�?也同时调到了正确的位置（基准值左边）。因此，左边也要向后挪一�?
                start++;
            }

        }

        // 这里返回start或�?end皆可，此时的start和end都为基准值所在的位置
        return end;
    }

    /**
     * 排序
     * @author 王武�?
     * @date 2018�?�?9�?下午1:59:26
     * @param a
     * @param start
     * @param end
     * @return void 返回类型
     */
    public static void sort(int[] a, int start, int end)
    {
        if (start > end)
        {
            // 如果只有�?��元素，就不用再排下去�?
            return;
        }
        else
        {
            // 如果不止�?��元素，继续划分两边�?归排序下�?
            int partition = divide(a, start, end);
            sort(a, start, partition - 1);
            sort(a, partition + 1, end);
        }
    }

    public static void main(String[] args)
    {
        int[] a = new int[] { 2, 7, 4, 5, 10, 1, 9, 3, 8, 6 };
        int[] b = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] c = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] d = new int[] { 1, 10, 2, 9, 3, 2, 4, 7, 5, 6 };
        int[] e = { 103, 104, 25, 26, 27, 28, 88, 97, 29, 94, 30, 32, 44, 59, 57, 58, 56, 98, 55, 46, 34, 84, 68, 69, 70, 71, 72, 73, 77, 74, 99, 102,
                106, 75, 76, 42, 43, 78, 79, 60, 61, 62, 64, 65, 66, 67, 63, 80, 81, 82, 83, 85, 86, 87, 89, 91, 92, 93, 10, 107, 108, 109, 110, 111,
                112, 113, 114, 115, 117, 118, 120, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 139, 138, 140, 141, 142,
                143, 144, 145, 146, 147, 148 };

        sort(e, 0, e.length - 1);

        for (int x : e)
        {
            System.out.print(x + ",");
        }

    }

}
