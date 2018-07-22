package com.ming.jbase.sortbase;

/**
 * 选择排序
 * @Title: SelectSort.java 
 * @Package com.jbase.sorttest 
 * @author 王武�?
 * @date 2018�?�?9�?下午5:40:53 
 * @version V1.0
 */
public class SelectionSort
{
    /**
     * �?��选择排序
     * @author 王武�?
     * @date 2018�?�?9�?下午5:55:44 
     * @return void    返回类型
     */
    public static void sort()
    {
        int[] arr={1,3,2,45,65,33,12};
        for(int num:arr){
            System.out.print(num+" ");
        }    
        
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int k = i;
            for (int j = i; j < arr.length; j++)
            {
                if (arr[j] < arr[k])
                {
                    k = j;
                }
            }
            
            if (i != k)
            {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        
        System.out.println();
        System.out.println("交换后：");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args)
    {
        sort();
    }
}
