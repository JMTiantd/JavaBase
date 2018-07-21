package com.ming.chapter1;

public class StaticMethodTest {

    /**
     * 判断一个数是否是素数
     * @param n
     * @return
     */
    public static boolean isPrime(int n)
    {
        if (n < 2) return false;
        for (int i = 2; i*i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
         a = isPrime(5);
    }

}
