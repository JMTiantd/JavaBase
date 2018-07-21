package com.ming.chapter1;

public class StaticMethodTest {

    /**
     * 鍒ゆ柇涓�釜鏁版槸鍚︽槸绱犳暟
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
         boolean a = isPrime(5);
    }

}
