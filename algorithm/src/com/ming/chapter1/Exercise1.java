package com.ming.chapter1;


/**
 * 
 * ��һ�µ���ϰ
 * @author lenovo-pc
 *
 */
public class Exercise1 {

    public static void main(String[] args) {
		System.out.println(gcd(84,196));
	}
    
    /**
     * ŷ������㷨
     * ���������Ǹ�����p��q�����Լ��
     * p��q�����Լ������p����q������r��q�����Լ��
     * 
     * Algorithms page 4
     */
    public static int gcd(int p,int q)
    {
    	if( q == 0) return p;
    	int r = p%q;
    	System.out.println(r);
    	return gcd(q, r);
	}
}
