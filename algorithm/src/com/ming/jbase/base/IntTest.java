package com.ming.jbase.base;

public class IntTest
{

    public static void main(String[] args)
    {
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

        // true
        System.out.println(f1 == f2);
        // false
        System.out.println(f3 == f4);

        /**
         * IntegerCache �?���?如果字面量的值在-128~127之间，那么不会new新的Integer对象
         * 而是直接引用常量池中的Integer
         */
        Integer.valueOf(f1);

        int a1 = 100, a2 = 100, a3 = 150, a4 = 150;
        System.out.println(a1 == a2);
        System.out.println(a3 == a4);

        /**
         * 一个char是两个字节 可以存下一个汉字 两个英文
         */
        Character ch= '我';
        System.out.println(ch);

        Float f = new Float(3.4);
        float ff = 3.4f;

        /**
         * += 操作
         */
        byte a = 127;
        byte b = 127;

        // b = a + b; error （因�?a+b 操作会将 a、b 提升�?int 类型，所以将 int 类型赋�?�?byte
        // 就会编译出错�?
        // ok -2
        b += a;
        System.out.println(b);
        
        //test getIntRandomArr
        System.out.println("-------------getIntRandomArr---------------");
        int[] intRandomArr = getIntRandomArr(30,360);
        for (int i : intRandomArr)
        {
            System.out.println(i);
        }
        
    }
    
    /**
     * 获取随机数组-等间隔获取随机数
     * 随机数 (最小值+Math.random()*(最大值-最小值+1))
     * @author 王武明
     * @date 2018年11月2日 上午10:24:16 
     * @param count
     * @param max
     * @return
     * @return Integer[]    返回类型
     */
    private static int[] getIntRandomArr(int count,int max)
    {
        int interval = max / count;
        int[] randomArr = new int[count];
        
        int thisMin = 0;
        int thisMax = 0;
        for (int i = 0; i<count;i++)
        {
            thisMin = i*interval+1;
            thisMax = (i+1)*interval;
            randomArr[i] = (int)(thisMin + Math.random()*(thisMax - thisMin + 1));
        }
        
        return randomArr;
    }
    
}
