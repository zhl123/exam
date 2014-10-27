package com.itheima;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * 8�� ����һ����׼��JavaBean������Person����������name��age��ʹ�÷���ķ�ʽ����һ��ʵ����
 *    ���ù��캯����ʼ��name��age��ʹ�÷��䷽ʽ����setName���������ƽ������ã�
 *    ��ʹ��setAge����ֱ��ʹ�÷��䷽ʽ��age��ֵ��
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
		
		//���÷������setName����
		Method setNameMethod = clazz.getMethod("setName", String.class);
		setNameMethod.invoke(person, "ZHL");
		
		//������ʡ����setAge����
		PropertyDescriptor pd = new PropertyDescriptor("age",person.getClass());
		Method setAgeMehod = pd.getWriteMethod();
		setAgeMehod.invoke(person, 23);
		
		//��ӡ������Ϣ
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
