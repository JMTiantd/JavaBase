package com.ming.jbase.treebase;

public class MyTreeTest
{

    public static void main(String[] args)
    {
        Node root = new Node(50, 25);
        
        MyTree myTree = new MyTree(root);
        myTree.insert(20, 530);
        myTree.insert(23, 30);
        myTree.insert(30, 130);
        myTree.insert(4, 0);
        myTree.insert(8, 890);
        myTree.insert(55, 123);
        myTree.insert(76, 99);
        myTree.show();
    }
}
