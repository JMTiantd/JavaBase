package com.ming.jalgo;

import lombok.ToString;

/**
 * 华容道问题(九宫格) 问题： 1.九宫格：给你八个数字，是否能排成某种特定的序列。 2.如果可以排成特定的序列，要如何实现。 解决：
 * 1.如何用代码(某种数据结构)表示这种情况。 2.如何用代码实现判断是否能排成特定序列，以及如何排成。
 * @Project: algorithm
 * @Package com.ming.jalgo
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-10 15:38
 * @Version V1.0
 */
@ToString
public class BlockInFree
{
    /**
     * 链表头结点
     */
    private Node first = null;

    /**
     * 链表尾节点
     */
    private Node last = null;

    /**
     * 链表长度
     */
    private int len = 0;

    public BlockInFree(Node[] node)
    {}

    /**
     * 判断是否可以排成特定的序列
     * @return
     */
    public boolean isCanSuccess()
    {
        return true;
    }

    /**
     * 插入节点
     */
    public void push(Node node)
    {
        if (first == null)
        {
            first = node;
        }
        else
        {
            if (last == null)
            {
                last = node;
                first.next = last;
            }
            else
            {
                last.next = node;
                last = node;
            }
        }
        len++;
    }

    /**
     * 移动某个节点(1~len) 指的是当前链表的尾节点指向该节点 使其变成尾节点
     */
    public boolean move(int x)
    {
        if (x >= len || len <= 0)
        {
            //要移动的节点必须是
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * 判断当前节点是否可以被移动成为尾节点
     * @param node
     * @return
     */
    public boolean isCouldMove(Node node)
    {
        //当前要移动的节点的值
        Integer moveItem = node.item;
        //当前尾节点的值
        Integer lastItem = last.item;

//        /**
//         * 这里的3和1是在九宫格的前提下
//         */
//        if (Math.abs(lastItem - moveItem) == 3 || Math.abs(lastItem - moveItem) == 1)
//        {
//            return true;
//        }else {
//            return false;
//        }

        return false;
    }

//    public Node[] findCanMoveNodes()
//    {
//    }

    /**
     * 定义一个内部类，表示节点
     */
    private static class Node
    {
        private Integer item;

        private Node next;

        private Node()
        {}
    }

}
