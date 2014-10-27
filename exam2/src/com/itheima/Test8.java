package com.itheima;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * 8、 定义一个标准的JavaBean，名叫Person，包含属性name、age。使用反射的方式创建一个实例、
 *    调用构造函数初始化name、age，使用反射方式调用setName方法对名称进行设置，
 *    不使用setAge方法直接使用反射方式对age赋值。
 * @author zhl
 *
 */
public class Test8 {

	/**
	 * @param args 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Person.class;
		Person person = (Person)clazz.newInstance();
		
		//利用反射调用setName方法
		Method setNameMethod = clazz.getMethod("setName", String.class);
		setNameMethod.invoke(person, "ZHL");
		
		//利用内省调用setAge方法
		PropertyDescriptor pd = new PropertyDescriptor("age",person.getClass());
		Method setAgeMehod = pd.getWriteMethod();
		setAgeMehod.invoke(person, 23);
		
		//打印个人信息
		System.out.println(person);
	}
}

class Person{
	private String name = null;
	private int age = 0;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "name:"+name+"\nage:"+age;
	}
	
}
