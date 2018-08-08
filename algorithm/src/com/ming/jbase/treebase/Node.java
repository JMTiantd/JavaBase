package com.ming.jbase.treebase;

public class Node
{
    /**
     * key
     */
    int key;
    
    /**
     * å€?
     */
    Object value;
    
    /**
     * å·¦èŠ‚ç‚?
     */
    Node leftChildNode;
    
    /**
     * å³èŠ‚ç‚?
     */
    Node rightChildNode;
    
    /**
     * æ„é?æ–¹æ³•
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
