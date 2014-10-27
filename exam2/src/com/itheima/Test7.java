package com.itheima;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
 /**
  * 7、 编写一个类，增加一个实例方法用于打印一条字符串。并使用反射手段创建该类的对象，
  *    并调用该对象中的方法。
  * @author zhl
  *
  */
public class Test7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//获得ZhlClass字节码
		Class clazz = ZhlClass.class;
		//反射手段创建该类的对象
		Constructor constractor = clazz.getConstructor(String.class,int.class);
		ZhlClass zhl = (ZhlClass)constractor.newInstance("ZHL",24);
		
		//反射手段创建该类的调用printInfo方法
		Method printInfoMethod = clazz.getMethod("printInfo");
		printInfoMethod.invoke(zhl);
		
		//反射手段创建该类的调用printString方法
		Method printStringMethod = clazz.getMethod("printString");
		printStringMethod.invoke(zhl);
	}

}

//ZhlClass类
class ZhlClass{
	private String name = null;
	private int age = 0;
	//两个构造函数
	public ZhlClass(){}
	public ZhlClass(String name,int age){
		this.name = name;
		this.age = age;
	}
	//打印信息
	public void printInfo(){
		System.out.println("姓名："+name+" 年龄："+age);
	}
	//打印String
	public void printString(){
		System.out.println("ZHL will be a HeiMa!");
	}
}
