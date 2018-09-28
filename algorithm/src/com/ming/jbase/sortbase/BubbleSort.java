package com.ming.jbase.sortbase;

/**
 * 冒泡排序
 * @Title: BubbleSort.java
 * @Package com.jbase.sorttest
 * @author 王武�?
 * @date 2018�?�?9�?下午4:31:36
 * @version V1.0
 */
public class BubbleSort
{

    /**
     * https://www.cnblogs.com/shen-hua/p/5422676.html 共需要比�?m = arr.length - 1
     * �? 每轮�?��比较 n = arr.length - 1 - i (i是第几轮 从零�?��)
     * @author 王武�?
     * @date 2018�?�?9�?下午4:57:42
     * @return void 返回类型
     */
    public static void sortA()
    {
        int[] arr = { 6, 3, 8, 2, 9, 1 };
        for (int i : arr)
        {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }

    /**
     * https://blog.csdn.net/u010853261/article/details/54891710
     * @author 王武�?
     * @date 2018�?�?9�?下午5:01:47
     * @return void 返回类型
     */
    public static void sortB(int[] a)
    {
        int n = a.length;
        int i, j;

        for (i = 0; i < n; i++)
        {// 表示n次排序过程�?
            for (j = 1; j < n - i; j++)
            {
                if (a[j - 1] > a[j])
                {// 前面的数字大于后面的数字就交�?
                 // 交换a[j-1]和a[j]
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * @author 王武�?
     * @date 2018�?�?9�?下午4:31:55
     * @param args
     * @return void 返回类型
     */
    public static void main(String[] args)
    {
        sortA();
    }

}
