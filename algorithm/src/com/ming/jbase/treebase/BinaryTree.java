package com.ming.jbase.treebase;

/**
 * 二叉树的链式存储
 * @Title: BinaryTree.java
 * @Package com.jbase.treetest
 * @author 王武�?
 * @date 2018�?�?4�?下午4:51:43
 * @version V1.0
 */
public class BinaryTree
{

    private TreeNode root = null;

    public static void main(String[] args)
    {

    }

    /**
     * 二叉树的结点数据结构
     * @Title: BinaryTree.java
     * @Package com.jbase.treetest
     * @author 王武�?
     * @date 2018�?�?4�?下午4:53:05
     * @version V1.0
     */
    private class TreeNode
    {

        private int key = 0;

        private String data = null;

        private boolean isVisted = false;

        private TreeNode leftChild = null;

        private TreeNode rightChild = null;

        public TreeNode()
        {}

        /**
         * 构�?方法
         * @param key
         * @param data
         */
        public TreeNode(int key, String data)
        {
            this.key = key;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }

    }

}
