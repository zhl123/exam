package com.itheima;

import java.lang.reflect.*;
import java.util.*;

/**
 * 1、 ArrayList<Integer> list = new ArrayList<Integer>(); 
 * 	      在这个泛型为Integer的ArrayList中存放一个String类型的对象。
 * 
 * 分析：由于泛型具有除数据类型的功能，编译后的字节码中并没有泛型类型的信息，
 * 		  所以可以通过反射加载ArrayList字节码，通过ArrayList的add方法的字节码来添加String对象！
 * @author zhl
 * 
 */

public class Test1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		//在list中添加Integer对象
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		
		//输出list中的内容
		System.out.println("Ingeger:"+list);
		
		
		//运用list反射加载ArrayList字节码
		Class clazz = list.getClass();
		//加载ArrayList类的add方法字节码
		Method addMethod = clazz.getMethod("add", Object.class);
		
		//list中预添加的字符串
		String str= "ZouHailin";
		
		//调用方法类的invoke方法为list添加String元素
		addMethod.invoke(list,str);
		System.out.println("Ingeger泛型加入String后:"+list);
	}

}
