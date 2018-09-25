package com.ming.myutils;

public class StringUtils
{

    /**
     * 去掉字符串中所有的空格
     * @param string
     * @return
     * @return String 返回类型
     */
    public static String removeAllBlank(String string)
    {
        if (!isEmpty(string))
        {
            string = string.replaceAll("[ *| *| *|//s*]*", "");
        }
        else
        {
            string = "";
        }
        return string;
    }

    /**
     * 去除字符串中头部和尾部所包含的空格（包括:空格(全角，半角)、制表符、换页符等）
     * @param s
     * @return
     */
    public static String trim(String s)
    {
        String result = "";
        if (null != s && !"".equals(s))
        {
            result = s.replaceAll("^[　*| *| *|//s*]*", "").replaceAll("[　*| *| *|//s*]*$", "");
        }
        return result;
    }

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     * @return boolean 返回类型
     */
    public static boolean isEmpty(String str)
    {
        boolean result = false;
        if (null == str)
        {
            result = true;
        }
        else if ("null".equals(str))
        {
            result = true;
        }
        else if ("".equals(str.trim()))
        {
            result = true;
        }
        
        return result;
    }

    /**
     * 判断是否是回文字符串
     * @param string
     * @return
     * @return boolean 返回类型
     */
    public static boolean isPalindrome(String string)
    {
        int N = string.length();
        for (int i = 0; i < N / 2; i++)
        {
            if (string.charAt(i) != string.charAt(N - 1 - i))
            {
                return false;
            }
        }
        return true;
    }

    /**
     * 以空白字符分隔字符串，返回字符串数组
     * @param s
     * @return
     * @return String[] 返回类型
     */
    public static String[] delimitedByWhitespace(String s)
    {
        String[] result = null;
        if (!isEmpty(s))
        {
            result = s.split("\\s+");
        }
        return result;
    }

    /**
     * 检查一个字符串数组中的元素
     * 是否已按照字母表顺序排列
     * @param a
     * @return
     * @return boolean    返回类型
     */
    public boolean isSorted(String[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            if (a[i - 1].compareTo(a[i]) > 0)
                return false;
        }
        return true;
    }

    
    public static void main(String[] args)
    {
        String ip = " 192.168.33.252 , 49.7.3.88";

        if (ip.contains(","))
        {
            String[] split = ip.split(",");
            ip = split[0].trim();
        }

        System.out.println(ip + " ss");
    }

}
