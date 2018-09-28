package com.ming.jbase.hashbase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这个程序用来 进行日期的相关测�?
 * @Title: DateTest.java
 * @Package com.jbase.datetest
 * @author 王武�?
 * @date 2018�?�?0�?下午1:33:30
 * @version V1.0
 */
public class DateTest
{

    /**
     * 设置格式化后的日期格�?
     */
    private static final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    private static final String PATTERNYMR = "yyyy-MM-dd";

    private static final String PATTERNYMR_DAY = "yyyyMMdd";

    /**
     * 日期格式�?
     * @author 王武�?
     * @date 2018�?�?0�?下午1:36:48
     * @param date
     * @return
     * @return String 返回类型
     */
    public static String dateFormat(Date date)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN);
        String formatDate = simpleDateFormat.format(date);
        return formatDate;
    }

    /**
     * 日期按照输入的格式格式化
     * @author 王武�?
     * @date 2018�?�?0�?下午1:45:58
     * @param date
     * @param parrern
     * @return
     * @return String 返回类型
     */
    public static String dateFormat(Date date, String parrern)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(parrern);
        String formatDate = simpleDateFormat.format(date);
        return formatDate;
    }

    /**
     * 日期转化成毫秒时间戳
     * @author 王武�?
     * @date 2018�?�?0�?下午1:55:53
     * @param date
     * @return
     * @return String 返回类型
     */
    public static long dateToMilliStamp(Date date)
    {
        long time = date.getTime();
        return time;
    }

    /**
     * 日期字符串转化成毫秒时间�?
     * @author 王武�?
     * @date 2018�?�?0�?下午2:08:57
     * @param dateStr
     * @return
     * @return long 返回类型
     */
    public static long dateToMilliStamp(String dateStr, String pattern)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date;
        long time = 0;
        try
        {
            date = simpleDateFormat.parse(dateStr);
            time = date.getTime();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return time;
    }

    /**
     * 把时间转换成秒时间戳
     * @author 王武�?
     * @date 2018�?�?0�?下午2:31:12
     * @param dateStr
     * @return
     * @return long 返回类型
     */
    public static long dateToSecondStamp(String dateStr, String pattern)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date;
        long time = 0;
        try
        {
            date = simpleDateFormat.parse(dateStr);
            time = date.getTime() / 1000;
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return time;
    }

    /**
     * 时间戳转换成日期
     * @author 王武�?
     * @date 2018�?�?0�?下午2:44:22
     * @param stamp
     * @return
     * @return Date 返回类型
     */
    public static String stampToDate(long stamp, String pattern)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = new Date(stamp);
        String formatDate = simpleDateFormat.format(date);
        return formatDate;
    }

    public static void main(String[] args)
    {

        // 日期格式化测�?
        String dateFormat = dateFormat(new Date());
        System.out.println(dateFormat);

        // 日期按照输入的格式格式化
        String dateFormat2 = dateFormat(new Date(), PATTERNYMR_DAY);
        System.out.println(dateFormat2);

        // 日期字符串转化成毫秒时间�?
        long dateToMilliStamp = dateToMilliStamp(dateFormat, PATTERN);
        System.out.println(dateToMilliStamp);

        // 日期字符串转化成秒时间戳
        long dateToSecondStamp = dateToSecondStamp(dateFormat2, PATTERNYMR_DAY);
        System.out.println(dateToSecondStamp);

        // 时间戳转换成日期
        String stampToDate = stampToDate(dateToMilliStamp, PATTERN);
        System.out.println(stampToDate);

    }

}
