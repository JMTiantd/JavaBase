package com.ming.chapter.chapter_1.section_1.stack;

import lombok.ToString;

/**
 * 定容栈 大小固定，类型为String
 * @Title: FixedCapacityStackOfStrings.java
 * @Package com.ming.chapter.chapter_1.section_1.stack
 * @author 王武明
 * @date 2018年9月28日 下午2:28:00
 * @version V1.0
 */
@ToString
public class FixedCapacityStackOfStrings
{
    private String[] a;

    private int len;

    public FixedCapacityStackOfStrings(int cap)
    {
        a = new String[cap];
    }

    public boolean isEmpty()
    {
        return len == 0;
    }

    public int size()
    {
        return len;
    }

    public void push(String item)
    {
        a[len++] = item;
    }

    /**
     * 疑问：这样处理的话，数组里面的值并没有被清空呀
     * 解答：被弹出的元素的引用仍然存在于数组中，但是
     * 这个元素实际上已经是一个孤儿了--它永远不会再被访问了
     * 但是java的垃圾回收机制并不知道这种情况，除非该引用被覆盖
     * 即使用例已经不再需要这个元素了，数组中的引用仍然可以让它继续存在
     * 这种情况称之为游离。
     * @author 王武明
     * @date 2018年9月28日 下午2:35:46
     * @return
     * @return String 返回类型
     */
    public String pop()
    {
        return a[--len];
    }
}
