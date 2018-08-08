package com.ming.chapter.chapter_1.exercise_1;

public class Exercise11_15
{

    
    public static void main(String[] args)
    {
        ex_1_12();
    }
    
    /**
     * 编写一段代码，打印出一个二维布尔数组的内容。
     * 其中，使用*表示真，空格表示假。
     * 打印出行号和列号
     * @author 王武明
     * @date 2018年7月25日 上午10:11:05 
     * @return void    返回类型
     */
    public static void ex_1_11()
    {
        
    }
    
    /**
     * 以下代码段会打印出什么结果？
     * @author 王武明
     * @date 2018年7月25日 上午10:35:03 
     * @return void    返回类型
     */
    public static void ex_1_12()
    {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = 9-i;
            System.out.println(a[i]);//9-0
        }
        System.out.println("***************");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = a[a[i]];
            System.out.println(a[i]);//0-44-0
        }
        System.out.println("***************");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);//0-44-0
        }
    }
    
    /**
     * 编写一段代码，打印出一个M行N列的二维数组的转置
     * （交换行和列）
     * @author 王武明
     * @date 2018年7月25日 上午10:56:50 
     * @return void    返回类型
     */
    public static void ex_1_13(int a[][])
    {
        
    }
    
    /**
     * 编写一个静态方法，接受一个整型参数N，返回不大于log2N（以2为底）的最大整数
     * 不要使用math库
     * @author 王武明
     * @date 2018年7月25日 上午11:05:24 
     * @return void    返回类型
     */
    public static void ex_1_14()
    {
        
    }
    
    /**
     * 编写一个静态方法histogrm(),接受一个整形数组a[]和一个整数M为参数
     * 并返回一个大小为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。
     * 如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和a.length相等
     * @author 王武明
     * @date 2018年7月25日 上午11:08:49 
     * @return void    返回类型
     */
    public static void ex_1_15()
    {
        
    }
    
}
