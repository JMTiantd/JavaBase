package com.ming.jbase.base;

/**
 * i++和++i测试
 * @Project: algorithm
 * @Package com.ming.jbase.base
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-29 13:37
 * @Version V1.0
 */
public class PlusTest
{
    /**
     * i++和++i测试
     * @param args
     */
    public static void main(String[] args)
    {
        Integer[] arr = new Integer[] { 3, 1, 5, 6, 7, 4, 2, 9, 8, 0 };

        int a = 5, b = 5;

        // result: 4 6
        System.out.println(arr[a++] + " " + a);

        // result: 2 6
        System.out.println(arr[++b] + " " + b);

        int i = 2, j = 2;

        /**
         * 解析：
         * i++改变的只有i
         * ++i既改变i,又改变赋值变量
         */
        int m = i++;
        int n = ++j;

        //3 , 3 , 2 , 3
        System.out.println(i);
        System.out.println(j);
        System.out.println(m);
        System.out.println(n);
    }

}
