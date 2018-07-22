package com.ming.jbase.base;

public class IntTest
{

    public static void main(String[] args)
    {
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        
        System.out.println(f1 == f2); // true
        System.out.println(f3 == f4); // false
        
        /**
         * IntegerCache  
         * �?���?如果字面量的值在-128~127之间，那么不会new新的Integer对象
         * 而是直接引用常量池中的Integer
         */
        Integer.valueOf(f1);
        
        int a1 = 100, a2 = 100, a3 = 150, a4 = 150;
        System.out.println(a1 == a2);
        System.out.println(a3 == a4);
        
        /**
         * += 操作�?
         */
        byte a = 127;
        byte b = 127;
        
        // b = a + b;  error （因�?a+b 操作会将 a、b 提升�?int 类型，所以将 int 类型赋�?�?byte 就会编译出错�?
        b += a; //ok -2
        System.out.println(b);
    
    
    }
}
