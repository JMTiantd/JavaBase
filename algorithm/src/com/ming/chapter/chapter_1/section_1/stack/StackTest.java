package com.ming.chapter.chapter_1.section_1.stack;

import org.junit.Test;

import com.ming.myutils.MyStdIn;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wuming.wang
 */
public class StackTest
{

    /**
     * 字符串定容栈测试
     * @param stackSize
     */
    public static void fixedCapacityStackOfStringsTest(int stackSize)
    {
        FixedCapacityStackOfStrings stackOfStrings;
        stackOfStrings = new FixedCapacityStackOfStrings(stackSize);

        while (MyStdIn.isNotStop())
        {
            String item = MyStdIn.readString();
            if (!item.equals("-"))
            {
                if (stackOfStrings.size() >= stackSize)
                {
                    System.out.println("stackOfStrings has full!!");
                    break;
                }
                else
                {
                    stackOfStrings.push(item);
                }
            }
            else if (!stackOfStrings.isEmpty())
            {

                /**
                 * 有问题：这个弹出并不是真的弹出。。。 不过是栈的长度减一了
                 */
                StdOut.print(stackOfStrings.pop() + "");
            }
        }

        StdOut.println("(" + stackOfStrings.size() + " left on stack");
        StdOut.println(stackOfStrings.toString());
    }

    @Test
    public static void fixedCapacityStackTest(int stackSize)
    {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<String>(stackSize);

        while (MyStdIn.isNotStop())
        {
            String item = MyStdIn.readString();
            if (!item.equals("-"))
            {
                if (s.size() >= stackSize)
                {
                    System.out.println("stackOfStrings has full!!");
                    break;
                }
                else
                {
                    s.push(item);
                }
            }
            else if (!s.isEmpty())
            {

                /**
                 * 有问题：这个弹出并不是真的弹出。。。 不过是栈的长度减一了
                 */
                StdOut.print(s.pop() + "");
            }
        }

        StdOut.println("(" + s.size() + " left on stack");
        StdOut.println(s.toString());
    }

    public static void main(String[] args)
    {
        // 定容栈
        //fixedCapacityStackOfStringsTest(5);

        // 泛型定容栈
        fixedCapacityStackTest(5);
    }

}
