package com.ming.chapter.chapter_1.section_2.elementary;

import lombok.ToString;

import java.util.Date;

/**
 * 定义一个可比较的date类数据类型
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_2.elementary
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-12 16:10
 * @Version V1.0
 */
@ToString
public class MyDate implements Comparable<MyDate>
{

    private final int day;

    private final int month;

    private final int year;

    /**
     * 构造函数
     * @param day
     * @param month
     * @param year
     */
    public MyDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int day()
    {
        return day;
    }

    public int month()
    {
        return month;
    }

    public int year()
    {
        return year;
    }

    /**
     * 注意 该方法的实现必须满足一下几个要求
     * 1.自反性，对于所有的v,都有v=v
     * 2.反对称性，对于所有的v<w都有v>w,且v=w时候w=v
     * 3.传递性，for all v, w, and x, if
     * v <= w and w <= x then v <=x
     * @param that
     * @return
     */
    @Override
    public int compareTo(MyDate that)
    {
        if (this.year > that.year)
        {
            return +1;
        }
        if (this.year < that.year)
        {
            return -1;
        }
        if (this.month > that.month)
        {
            return +1;
        }
        if (this.month > that.month)
        {
            return -1;
        }
        if (this.day > that.day)
        {
            return +1;
        }
        if (this.day > that.day)
        {
            return -1;
        }

        return 0;
    }


}
