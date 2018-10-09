package com.ming.chapter.chapter_1.section_1.UF;

/**
 * quick-union 算法（quick-find算法的改良）
 * 重点是提高union方法的速度，它和union-find算法是互补的。
 * 它也是基于相同的数据结构--以触点作为索引的id[]数组
 *
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_1.UF
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-08 16:26
 * @Version V1.0
 */
public class UnionFindTwo implements UF
{

    /**
     * 分量id 以触点作为索引
     */
    private int[] id;

    /**
     * 分量数量
     */
    private int count;

    public UnionFindTwo(int N)
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
        // 将p和q的根节点统一
        int pRoot = find(p);
        int qRoot = find(q);

        if(pRoot == qRoot)
        {
            return;
        }

        // 让一棵树的根节点指向另一棵树的根节点
        id[pRoot] = qRoot;

        count--;
    }

    /**
     * 每个触点所对应的id[]元素都是同一个分量中的另一个触点的名称
     * 我们将这种联系称为链接。类似于树结构。
     * (注意：这里不是指id[p]和id[q]的值相同，和quick-find不一样)
     *
     * 我们从给定的触点开始，由它的
     * 链接得到另一个触点，再有这个触点
     * 的链接到达第三个触点
     * 如此继续跟随着链接直到到达一个根触点
     * 即链接指向自己的触点（你将会看到，这样一个触点必然存在？）
     * 当且仅当分别由两个触点开始的这个过程到达了同一个根触点时
     * 它们存在于同一个连通分量中。
     * 为了保证这个过程的有效性，需要union方法来保证这一点！！！
     * @param p
     * @return
     */
    @Override
    public int find(int p)
    {
        //找出分量的名称
        while (p != id[p])
        {
            p = id[p];
        }
        //相当于是返回树的根节点
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
