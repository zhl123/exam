package com.itheima;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test4 {

	/**
	 * 4、 编写一个类，在main方法中定义一个Map对象（采用泛型），
	 * 	      加入若干个对象，然后遍历并打印出各元素的key和value。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		//添加对象
		map.put(0, "ZHL");
		map.put(1, "zou");
		map.put(2, "hai");
		map.put(3, "lin");	
		
		//打印map中元素的个数
		System.out.println("map大小："+map.size());
		Set key= map.keySet();
		//输出map中的key值
		System.out.println("map中的key值："+key);
		//利用迭代器输出map中的value值
		Iterator keyIt = key.iterator();
		while(keyIt.hasNext()){
			Object num = keyIt.next();
			System.out.println(num+":"+map.get(num));
		}
	}
}
