package com.itheima;

import java.util.Arrays;

/**
 * 9、 在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符，如果存在，
 *    则返回这个字符在字符数组中第一次出现的位置（序号从0开始计算），否则，返回-1。
 *    要搜索的字符数组和字符都以参数形式传递传递给该方法，如果传入的数组为null，
 *    应抛出IllegalArgumentException异常。在类的main方法中以各种可能出现的情况测试验证该方法
 *    编写得是否正确，例如，字符不存在，字符存在，传入的数组为null等。
 * @author zhl
 *
 */
public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//数组不为空，字符存在
		char [] ch = new char[]{'z','h','l'};

		char c1 = 'h';
		System.out.println("1、数组("+Arrays.toString(ch)+")不为空，字符("+c1+")存在:");
		search(ch, c1);
		
		//数组不为空，字符不存在

		char c2 = 'n';
		System.out.println("2、数组("+Arrays.toString(ch)+")不为空，字符("+c2+")不存在:");
		search(ch, c2);
		
		//数组为空，字符不存在或存在
		System.out.println("3、数组为空，字符不存在或存在");
		char [] ch1 = null;
		search(ch1, c1);
	}
	public static void search(char [] ch,char c){
		int index = -1;
		try{
			for(int i = 0;i<ch.length;i++){
				if(c == ch[i]){
					index = i;
					break;
				}
			}
			if(index>0)
				System.out.println(c+"的下标"+index);
			else
				System.out.println("数组中没有字符："+c);
		}catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
			System.out.println("您输入字符串数组为空！");
		}
	}

}
