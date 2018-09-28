package com.ming.jbase.treebase;

public class MyTree
{

    private Node root;

    public MyTree()
    {

    }

    /**
     * 构�?方法
     * @param node
     */
    public MyTree(Node node)
    {
        this.root = node;
    }

    /**
     * 插入结点
     * @author 王武�?
     * @date 2018�?�?1�?上午9:33:19
     * @param key
     * @param value
     * @return void 返回类型
     */
    public void insert(int key, Object value)
    {
        Node node = new Node(key, value);
        if (this.root == null)
        {
            this.root = node;
        }
        else
        {
            Node currentNode = this.root;
            while (true)
            {
                if (key > currentNode.key)
                {
                    if (currentNode.rightChildNode == null)
                    {
                        currentNode.rightChildNode = node;
                        return;
                    }
                    else
                    {
                        currentNode = currentNode.rightChildNode;
                    }
                }
                else
                {
                    if (currentNode.leftChildNode == null)
                    {
                        currentNode.leftChildNode = node;
                        return;
                    }
                    else
                    {
                        currentNode = currentNode.leftChildNode;
                    }
                }
            }
        }
    }

    /**
     * 查找结点
     * @author 王武�?
     * @date 2018�?�?1�?上午11:22:12
     * @param key
     * @return
     * @return Node 返回类型
     */
    public Node find(int key)
    {
        Node currentNode = null;
        if (this.root != null)
        {
            currentNode = this.root;
            while (currentNode.key != key)
            {
                if (key > currentNode.key)
                {
                    currentNode = currentNode.rightChildNode;
                }
                else
                {
                    currentNode = currentNode.leftChildNode;
                }

                if (currentNode == null)
                {
                    return null;
                }
            }
        }
        return currentNode;
    }

    /**
     * 展示
     * @author 王武�?
     * @date 2018�?�?1�?下午1:27:01
     * @return void 返回类型
     */
    public void show()
    {
        this.show(root);
    }

    /**
     * 中序遍历
     * @author 王武�?
     * @date 2018�?�?1�?下午1:27:53
     * @param node
     * @return void 返回类型
     */
    private void show(Node node)
    {
        if (node != null)
        {
            this.show(node.leftChildNode);
            System.out.println(node.key + ":" + node.value);
            this.show(node.rightChildNode);
        }
    }

}
