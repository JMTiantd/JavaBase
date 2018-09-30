package com.ming.chapter.chapter_1.section_1.stack;

import lombok.ToString;

import java.util.Iterator;

/**
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_1.stack
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-09-28 17:50
 * @Version V1.0
 */
@ToString
public class FixedCapacityStack<Item> implements Iterable<Item>
{

    private Item[] a;

    private int len;

    public FixedCapacityStack(int cap)
    {
        // 由于历史原因 java不允许使用泛型数组
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

    /**
     * 在push中需要检查数组大小 来检查数组是否能够容纳新的元素 不够大就要扩容
     * @param item
     */
    public void push(Item item)
    {
        if (len == a.length)
        {
            resize(2 * a.length);
        }
        a[len++] = item;
    }

    /**
     * 在pop中首先移除栈顶的元素 如果数组太大我们就将它的长度减半 正确的检查条件就是栈大小是否小于数组的四分之一。
     * 在数组长度被减半之后，它的状态为半满，在下次 需要修改数组大小之前仍然能够进行多次push和pop操作
     * @return
     */
    public Item pop()
    {
        Item item = a[--len];

        /**
         * 这是为了避免对象游离，避免对象游离很简单 只需要将被弹出的元素的值设置为null即可 这将覆盖无用的引用并使系统可以再用例使用完
         * 被弹出的元素后回收它的内存
         */
        a[len] = null;

        if (len > 0 && len == a.length / 4)
        {
            resize(a.length / 2);
        }
        return item;
    }

    /**
     * 这是为了动态调整数组大小
     */
    private void resize(int max)
    {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < len; i++)
        {
            temp[i] = a[i];
        }
        a = temp;
    }

    /**
     * 对于一个可迭代的集合数据类型： 1.集合数据类型必须实现一个iterator方法 并返回一个iterator对象
     * 2.Iterator类必须包含两个方法：hasNext()(返回一个布尔值)和 next()(返回集合中的一个泛型元素)
     * @return
     */
    @Override
    public Iterator<Item> iterator()
    {
        return new ReverseArrayIterator();
    }

    /**
     * 逆序迭代遍历数组-迭代器
     * 迭代器是什么？
     * 答：它是一个实现了hasNext和next方法的类的对象
     *
     * 这是一个嵌套类
     * 嵌套类：可以访问包含它的类的实例变量，在这里就是a[]和len
     * 这也是这里使用嵌套类实现迭代器的主要原因
     */
    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = len;

        @Override
        public boolean hasNext()
        {
            return i > 0;
        }

        @Override
        public Item next()
        {
            return a[--i];
        }

        @Override
        public void remove()
        {}
    }

}
