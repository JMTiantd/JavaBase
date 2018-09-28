package com.ming.chapter.chapter_1.section_1.stack;

import org.junit.Test;

import com.ming.myutils.MyStdIn;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wuming.wang
 */
public class StackTest
{

    @Test
    public static void fixedCapacityStackOfStringsTest(int stackSize)
    {
        FixedCapacityStackOfStrings stackOfStrings;
        stackOfStrings = new FixedCapacityStackOfStrings(stackSize);

        while (!MyStdIn.isNotStop())
        {
            String item = MyStdIn.readString();
            if (!item.equals("-"))
            {
                if (stackOfStrings.size()>= stackSize)
                {
                    System.out.println("stackOfStrings has full!!");
                    break;
                }else {
                    stackOfStrings.push(item);
                }
            }else if (!stackOfStrings.isEmpty())
            {
                StdOut.print(stackOfStrings.pop()+"");
            }
        }

        StdOut.println("(" + stackOfStrings.size() + " left on stack");
        StdOut.println(stackOfStrings.toString());
    }

    public static void main(String[] args)
    {
        // 定容栈
        fixedCapacityStackOfStringsTest(5);
    }

}
