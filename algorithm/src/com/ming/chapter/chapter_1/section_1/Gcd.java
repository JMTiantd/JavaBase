package com.ming.chapter.chapter_1.section_1;

public class Gcd
{
    public static void main(String[] args)
    {
        System.out.println(gcd(84, 196));
    }

    /**
     * 欧几里得算法 计算两个非负整数p和q的最大公约数 p和q的最大公约数等于p除以q的余数r与q的最大公约数 Algorithms page 4
     */
    public static int gcd(int p, int q)
    {
        if (q == 0)
            {return p;}
        int r = p % q;
        System.out.println(r);
        return gcd(q, r);
    }
}