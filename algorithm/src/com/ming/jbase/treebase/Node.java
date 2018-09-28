package com.ming.jbase.treebase;

public class Node
{
    /**
     * key
     */
    int key;

    /**
     * �?
     */
    Object value;

    /**
     * 左节�?
     */
    Node leftChildNode;

    /**
     * 右节�?
     */
    Node rightChildNode;

    /**
     * 构�?方法
     * @param key
     * @param value
     */
    public Node(int key, Object value)
    {
        super();
        this.key = key;
        this.value = value;
    }

}
