package com.ss.avery;

/**
 * @discription:this is a test
 * @author: avery
 * @date:2018年4月22日
 */
public class Test {
	//查找的方法
	public static int search(int s, int[] a) {
		return m(s, a, 0, a.length - 1);
	}
	//递归调用
	public static int m(int s, int[] a, int low, int hight) {
		if (low <= hight) {
			int m = (low + hight) / 2;
			if (s < a[m]) {
				m(s, a, low, m - 1);
			} else if (s > a[m]) {
				m(s, a, m + 1, hight);
			} else {
				return m;
			}
		}
		return -1;
	}
	//main方法
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b = search(5, a);
		if (b == -1)
			System.out.println("没有找到");
		else
			System.out.println("找到下标为" + b + "值为：" + a[b]);

	}
}
