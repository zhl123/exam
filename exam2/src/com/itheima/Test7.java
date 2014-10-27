package com.itheima;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
 /**
  * 7�� ��дһ���࣬����һ��ʵ���������ڴ�ӡһ���ַ�������ʹ�÷����ֶδ�������Ķ���
  *    �����øö����еķ�����
  * @author zhl
  *
  */
public class Test7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//���ZhlClass�ֽ���
		Class clazz = ZhlClass.class;
		//�����ֶδ�������Ķ���
		Constructor constractor = clazz.getConstructor(String.class,int.class);
		ZhlClass zhl = (ZhlClass)constractor.newInstance("ZHL",24);
		
		//�����ֶδ�������ĵ���printInfo����
		Method printInfoMethod = clazz.getMethod("printInfo");
		printInfoMethod.invoke(zhl);
		
		//�����ֶδ�������ĵ���printString����
		Method printStringMethod = clazz.getMethod("printString");
		printStringMethod.invoke(zhl);
	}

}

//ZhlClass��
class ZhlClass{
	private String name = null;
	private int age = 0;
	//�������캯��
	public ZhlClass(){}
	public ZhlClass(String name,int age){
		this.name = name;
		this.age = age;
	}
	//��ӡ��Ϣ
	public void printInfo(){
		System.out.println("������"+name+" ���䣺"+age);
	}
	//��ӡString
	public void printString(){
		System.out.println("ZHL will be a HeiMa!");
	}
}
