package com.ming.chapter.chapter_1.section_1;
import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;


/**
 * 二分法
 * @author lenovo-pc
 *
 */
public class BinarySearch {

	private BinarySearch(){ }
	public static void main(String[] args) {
		
		In in = new In("res/num1.txt");
		int[] whitelist = in.readAllInts();
		
		//sort the array
		Arrays.sort(whitelist);
		
		while( !StdIn.isEmpty())
		{
			int key = StdIn.readInt();
			if (BinarySearch.indexOf(whitelist, key) == -1) {
				StdOut.println(key);
			}
		}
	}
	

	public static int indexOf(int[] a,int key)
	{
		int lo = 0;
		int hi = a.length - 1;
		while( lo <= hi)
		{
			int mid = lo + (hi - lo)/2;
			if       ( key <a[mid]) {hi = mid - 1;}
			else if( key >a[mid]) {lo = mid +1;}
			else  {return mid;}
		}		
		return -1;
	}
	
	@Deprecated
	public static int rank(int key,int[] a){
		return indexOf(a, key);
	}

}
