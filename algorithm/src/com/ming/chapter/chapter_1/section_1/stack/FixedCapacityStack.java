package com.ming.chapter.chapter_1.section_1.stack;

import lombok.ToString;

/**
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_1.stack
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-09-28 17:50
 * @Version V1.0
 */
@ToString
public class FixedCapacityStack<Item>
{

    private Item[] a;

    private int len;

    public FixedCapacityStack(int cap)
    {
        // a = new Item[cap];
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty()
    {
        return len == 0;
    }

    public int size()
    {
        return len;
    }

    public void push(Item item)
    {
        a[len++] = item;
    }

    public Item pop()
    {
        return a[--len];
    }

}
