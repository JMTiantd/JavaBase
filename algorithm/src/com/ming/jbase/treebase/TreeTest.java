package com.ming.jbase.treebase;

/**
 * 二叉树的各种知识的求�?
 * 1. 求二叉树的最大深�?
 * 2.
 * @Title: TreeTest.java
 * @Package com.jbase.treetest
 * @author 王武�?
 * @date 2018�?�?8�?上午10:43:11
 * @version V1.0
 */
public class TreeTest
{

    public static void main(String[] args)
    {
        testSomeThing();
    }
    
    private static void testSomeThing()
    {
        int a = 5,b = 18;
        int max = Math.max(a, b);
        System.out.println(max);
        
        int i = Integer.MIN_VALUE + 1;
        System.out.println(i);
    }
    
    /**
     * 1. 求二叉树的最大深�?
     * 深度概念：二叉树的根结点�?��的层数为1，根结点的孩子结点所在的层数�?�?
     * 以此下去。深度是指所有结点中�?��的结点所在的层数�?
     * @author 王武�?
     * @date 2018�?�?8�?上午10:53:20 
     * @param node
     * @return
     * @return int    返回类型
     */
    int maxDepth(TreeNode node)
    {
        if (node == null)
        {
            return 0;
        }
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        return Math.max(left, right) + 1;
    }
    
    /**
     * 求二叉树的最小深�?
     * @author 王武�?
     * @date 2018�?�?8�?上午11:06:22 
     * @param root
     * @return
     * @return int    返回类型
     */
    int getMinDepth(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        return getMin(root);
    }
    
    int getMin(TreeNode root)
    {
        if (root == null)
        {
            return Integer.MAX_VALUE;  //这是啥意思？ 
        }
        if (root.left == null && root.right == null)
        {
            return 1;
        }
        return Math.min(getMin(root.left), getMin(root.right)) + 1;
    }
    
    /**
     * 求二叉树中节点的个数
     * @author 王武�?
     * @date 2018�?�?8�?上午11:28:56 
     * @param root
     * @return
     * @return int    返回类型
     */
    int numOfTreeNode(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        int left = numOfTreeNode(root.left);
        int right = numOfTreeNode(root.right);
        return left + right + 1;
    }

    /**
     * 求二叉树中叶子节点的个数
     * @author 王武�?
     * @date 2018�?�?8�?上午11:36:04 
     * @param root
     * @return
     * @return int    返回类型
     */
    int numsOfNoChildNode(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        if (root.left == null && root.right == null)
        {
            return 1;
        }
        return numsOfNoChildNode(root.left) + numsOfNoChildNode(root.right);
    }
    
    
}

class TreeNode
{

    int val;

    TreeNode left;

    TreeNode right;

}
