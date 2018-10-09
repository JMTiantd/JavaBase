package com.ming.chapter.chapter_1.section_1.UF;

/**
 * 加权 quick-union 算法
 * 与其在union()中随意将一棵树连接到另一棵树 我们现在会记录每一棵树的大小并总是将较小的树连接到 较大的树上。
 * 该算法构造的树的高度远远小于未加权的版本所构造的树的高度
 *
 * 名词定义
 * 树的大小：一棵树的大小是它的节点的数量
 * 节点的深度：一棵树上的节点的深度是它到根节点的路径上的链接数
 * 树的高度：树的高度是它的所有节点中的最大深度
 *
 * 命题
 * 对于N个触点，加权union-find算法构造的森林中的任意节点的深度最多为lgN
 *
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_1.UF
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-09 10:52
 * @Version V1.0
 */
public class UnionFindThree implements UF
{

    /**
     * 分量id 以触点作为索引
     */
    private int[] id;

    /**
     * 各个 根节点 所对应的分量的大小 以触点作为索引
     */
    private int[] sz;

    /**
     * 分量数量
     */
    private int count;

    public UnionFindThree(int N)
    {
        // 初始化分量id数组
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
        {
            id[i] = i;
        }
        sz = new int[N];
        for (int i = 0; i < N; i++)
        {
            sz[i] = 1;
        }
    }

    @Override
    public void union(int p, int q)
    {
        int i = find(p);
        int j = find(q);
        if (i == j)
        {
            return;
        }

        if (sz[i] < sz[j])
        {
            id[i] = j;
            sz[j] += sz[i];
        }
        else
        {
            id[j] = i;
            sz[i] += sz[j];
        }

        count--;
    }

    @Override
    public int find(int p)
    {
        while (p != id[p])
        {
            p = id[p];
        }
        return p;
    }

    @Override
    public boolean connected(int p, int q)
    {
        return find(p) == find(q);
    }

    @Override
    public int count()
    {
        return count;
    }
}
