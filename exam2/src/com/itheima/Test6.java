package com.itheima;

/**
 * 6、 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * @author zhl
 *
 */

public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<10;i++){
			System.out.println((int)(Math.random()*20+1));
		}
	}
}
