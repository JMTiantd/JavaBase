package com.ming.chapter.chapter_1.section_1.UF;

/**
 * union-find 问题实现
 *（
 *   使用quick-find算法实现:
 *   一般无法处理大型问题，因为对于每一对输入union都要扫描整个id[]数组
 * ）
 * 为了解决动态连通性问题，所有的实现都应该包含以下几个方面：
 * 1.定义一种数据结构表示已知的连接
 * 2.基于此数据结构高效实现UF相关方法 本次设计说明： 触点和分量都是int类型
 * 以触点为索引的数组id[]作为基本的数据结构来表示所有分量
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_1.UF
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-08 14:01
 * @Version V1.0
 */
public class UnionFindOne implements UF
{

    /**
     * 分量id 以触点作为索引
     */
    private int[] id;

    /**
     * 分量数量
     */
    private int count;

    public UnionFindOne(int N)
    {
        // 初始化分量id数组
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
        {
            id[i] = i;
        }
    }

    /**
     * 要将p和q所在分量的值变为同一个值
     * 遍历整个id数组，使得id[p]和id[q] 变成同一个值
     * 时间复杂度为N
     * 访问数组的次数在(N+3)到(2N+1)之间
     * @param p
     * @param q
     */
    @Override
    public void union(int p, int q)
    {
        int pID = find(p);
        int qID = find(q);

        if (pID == qID)
        {
            return;
        }

        for (int i = 0; i < id.length; i++)
        {
            if (id[i] == pID)
            {
                id[i] = qID;
            }
        }

        count--;
    }

    @Override
    public int find(int p)
    {
        return id[p];
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
