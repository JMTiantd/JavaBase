package com.ming.chapter.chapter_1.section_1.UF;

/**
 * union-find算法
 *
 * API功能：
 *
 * 连接两个触点、判断包含某个触点的分量、
 * 判断两个触点是否存在于同一个分量之中、返回所有分量的数量
 *
 * 名词解释：
 *
 * 某个对象 ---> 对象 ---> 触点
 * 两个对象 ---> 整数对 ---> 连接
 * 两个建立连接的对象 ---> 等价类 ---> 连通分量/分量
 *
 * @Project: algorithm
 * @Package com.ming.chapter.chapter_1.section_1.UF
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-10-08 13:24
 * @Version V1.0
 */
public interface UF
{

    /**
     * 在p和q之间添加一条连接
     * 如果两个触点在不同的分量中，
     * union()操作会将两个分量归并。
     * 一开始我们有N个分量，将两个分量归并的每次操作都会使总的分量减一
     * @param p
     * @param q
     */
    void union(int p,int q);

    /**
     * p所在的分量的标识符(0 ~ N-1)
     * find()操作会返回给定触点所在连通分量的标示符
     * @param p
     * @return
     */
    int find(int p);

    /**
     * 如果p和q存在于同一个分量中则返回true
     * connected()操作能够判断两个触点是否存在于同一个分量之中
     * @param p
     * @param q
     * @return
     */
    boolean connected(int p,int q);

    /**
     * 连通分量的数量
     * count()操作会返回所有连通分量的数量
     * @return
     */
    int count();

}
